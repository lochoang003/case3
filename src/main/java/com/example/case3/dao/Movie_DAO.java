package com.example.case3.dao;

import com.example.case3.model.Genre;
import com.example.case3.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Movie_DAO {
    DAO dao = new DAO();
    Connection connection = dao.getConnection();
    private static final String INSERT_MOVIE_SQL = "INSERT INTO  `movie`.`movie` (`name_movie`, `time_movie`, `broadcast_date`, `date_of_manufacture`, `summary`, `image_movie`, `video`, `id_Nation`, `id_director`) " +
            "VALUES (?,?,?,?,?,?,?,?,?);";
   // private static final String SELECT_MOVIE_ID = "select * from `movie`.`movie` where id_movie =?";
    private static final String SELECT_ALL_MOVIE = "select movie.* from `movie`.`movie`";
    private static final String SELECT_TRENDING_MOVIE = "select movie.* from `movie`.`movie` order by view desc limit 5";
        private static final String DELETE_MOVIE_SQL = "delete from `movie`.`movie` where id_movie = ?;";
   private static final String UPDATE_MOVIE_SQL = "update `movie`.`movie` set" +
            " `name_movie` =?, `time_movie` =?, `broadcast_date` =?, `date_of_manufacture` =?, `summary` =?, `image_movie` =?, `video` =?, `id_Nation` =?, `id_director` =?" +
            " where id_movie = ?;";
    private static final String NATION = "select `nation`.`name_nation` from `nation` " +
            "join `movie` on nation.id_nation = movie.id_nation " +
            "where movie.id_movie=? ;";
    private static final String DIRECTOR = "select `director`.`name_director` from `director` " +
            "join `movie` on director.id_director = movie.id_director " +
            "where movie.id_movie=?;";
    private static final String SELECT_MOVIE_GENRE = "SELECT movie.* FROM movie " +
            "join movie_genre on movie.id_movie = movie_genre.id_movie " +
            "join genre on movie_genre.id_genre = genre.id_genre where genre.id_genre = ?;";

// tìm phim  theo id

    public Movie selectMovie(long id) {
        Movie movie = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MOVIE_ID)) {
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name_movie");
                int time = rs.getInt("time_movie");
                String broadCast = rs.getString("broadcast_date");
                String manufacture = rs.getString("date_of_manufacture");
                String summary = rs.getString("summary");
                String img = rs.getString("image_movie");
                String video = rs.getString("video");
                long view = rs.getLong("view");
                String nation = "";
                try (PreparedStatement ps = connection.prepareStatement(NATION)) {
                    ps.setLong(1, id);
                    ResultSet rs1 = ps.executeQuery();
                    while (rs.next()) {
                        nation += rs1.getString("name_nation") + " ";
                    }
                }
                String director = "";
                try (PreparedStatement ps = connection.prepareStatement(DIRECTOR)) {
                    ps.setLong(1, id);
                    ResultSet rs1 = ps.executeQuery();
                    while (rs.next()) {
                        director += rs1.getString("name_director") + " ";
                    }
                }
                movie = new Movie(id, name, time, broadCast, manufacture, summary, img, video, director, nation, view);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movie;
    }

    // thêm phim
public void insertMovie(Movie movie) throws SQLException {
    try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MOVIE_SQL)) {
        preparedStatement.setString(1, movie.getName());
        preparedStatement.setInt(2, movie.getTime());
        preparedStatement.setString(3, movie.getBroadCast());
        preparedStatement.setString(4, movie.getManufacture());
        preparedStatement.setString(5, movie.getSummary());
        preparedStatement.setString(6, movie.getImg());
        preparedStatement.setString(7, movie.getVideo());
        preparedStatement.setString(8, movie.getNation());
        preparedStatement.setString(9, movie.getDirector());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public boolean updateMovie(Movie movie)throws Exception{
    boolean checkExecute;
    try (CallableStatement callSta =connection.prepareCall(UPDATE_MOVIE_SQL);
    ){callSta.setString(1, movie.getName());
        callSta.setInt(2, movie.getTime());
        callSta.setString(3, movie.getBroadCast());
        callSta.setString(4, movie.getManufacture());
        callSta.setString(5, movie.getSummary());
        callSta.setString(6, movie.getImg());
        callSta.setString(7, movie.getVideo());
        callSta.setString(8, movie.getNation());
        callSta.setString(9, movie.getDirector());
        callSta.setInt(10, (int) movie.getId());
        return checkExecute=callSta.execute();
    }
}
public boolean remoteMovie(int id)throws Exception{
    boolean checkExecute;
    try(CallableStatement callSta =connection.prepareCall(DELETE_MOVIE_SQL)) {
        callSta.setInt(1,id);
        return checkExecute= callSta.execute();
    }
}
    public List<Movie> getMovie(ResultSet resultSet) throws SQLException {
        List<Movie> movies = new ArrayList<>();
        while (resultSet.next()) {
            long id = resultSet.getLong("id_movie");
            String name = resultSet.getString("name_movie");
            int time = resultSet.getInt("time_movie");
            String broadcast = resultSet.getString("broadcast_date");
            String manufacture = resultSet.getString("date_of_manufacture");
            String summary = resultSet.getString("summary");
            String image = resultSet.getString("image_movie");
            String video = resultSet.getString("video");
            long view = resultSet.getLong("view");
            String nation = "";
            try (PreparedStatement ps = connection.prepareStatement(NATION)) {
                ps.setLong(1, id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    nation += rs.getString("name_nation") + " ";
                }
            }
            String director = "";
            try (PreparedStatement ps = connection.prepareStatement(DIRECTOR)) {
                ps.setLong(1, id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    director += rs.getString("name_director") + " ";
                }
            }
            Movie movie = new Movie(id, name, time, broadcast, manufacture, summary, image, video, director, nation, view);
            movies.add(movie);
        }
        return movies;
    }

    public List<Movie> getMovieByGenre(int idGenre) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MOVIE_GENRE)
        ) {
            preparedStatement.setInt(1, idGenre);
            ResultSet resultSet = preparedStatement.executeQuery();
            movies = getMovie(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }

    public List<Movie> getAllMovieGenre() {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MOVIE)
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            movies = getMovie(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }

    public List<Movie> getTrending() {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TRENDING_MOVIE)
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            movies = getMovie(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }


}
