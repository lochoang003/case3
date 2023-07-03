package com.example.case3.dao;

import com.example.case3.model.Actor;
import com.example.case3.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Movie_DAO {
    DAO dao = new DAO();
    Connection connection = dao.getConnection();
//    private static final String INSERT_MOVIE_SQL = "INSERT INTO `movie`.`movie` (`name_movie`, `time_movie`, `summary`, `view`, `id_Nation`, `id_director`) VALUES ('1', '1', '124241', '142', '1', '1')";
    private static final String SELECT_MOVIE_BY_ID = "SELECT * FROM `movie`.`movie` where id = ?";
    private static final String SELECT_ALL_MOVIE = "SELECT * FROM `movie`.`movie`";
    private static final String DELETE_MOVIE = "DELETE FROM `movie`.`movie` WHERE ID = ? ";

    public Movie_DAO() {
    }

//    public void insertActor(Actor actor) throws SQLException {
//        System.out.println(INSERT_ACTOR_SQL);
//        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACTOR_SQL)) {
//            preparedStatement.setString(1, actor.getName_Actor());
//            preparedStatement.setInt(2, actor.getAge());
//            preparedStatement.setString(3, actor.getImage_Actor());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public List<Movie> selectAllMovie() {
        List<Movie> movie = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MOVIE);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                long id = rs.getInt("id_movie");
                String name = rs.getString("name_movie");
                int time = rs.getInt("time_movie");
                String broadCast = rs.getString("broadcast_date");
                String manufacture = rs.getString("date_of_manufacture");
                String summary = rs.getString("summary");
                String img = rs.getString("image_movie");
                String video = rs.getString("video");
                String nation = rs.getString("nation");
                Long view = rs.getLong("view");
                movie.add(new Movie(id,name,time,broadCast,manufacture,summary,img,video,name,view));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movie;
    }

    public Movie selectMovie(int id) {
        Movie movie = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MOVIE_BY_ID)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name_movie");
                int time = rs.getInt("time_movie");
                String broadCast = rs.getString("broadcast_date");
                String manufacture = rs.getString("date_of_manufacture");
                String summary = rs.getString("summary");
                String img = rs.getString("image_movie");
                String video = rs.getString("video");
                String nation = rs.getString("nation");
                Long view = rs.getLong("view");
                movie = new Movie(id,name,time,broadCast,manufacture,summary,img,video,name,view);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movie;
    }
        public boolean deleteMovie(int id) throws SQLException{
        boolean rowDeleted;
        try(PreparedStatement preparedStatement = connection.prepareStatement(DELETE_MOVIE)){
            preparedStatement.setInt(1,id);
            rowDeleted = preparedStatement.executeUpdate() >0;
        }
        return rowDeleted;
    }
}

