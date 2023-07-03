package com.example.case3.dao;

import java.sql.Connection;

public class Director_DAO {
    DAO dao = new DAO();
    Connection connection = dao.getConnection();
    private static final String INSERT_DIRECTOR_SQL = "INSERT INTO director(id_director,name_director, image_director) VALUES (?,?,?);";
    private static final String SELECT_DIRECTOR_BY_ID = "select id_director,name_director,image_director from director where id = ?";
    private static final String SELECT_ALL_DIRECTOR = "select * from director";
    private static final String DELETE_DIRECTORS_SQL = "delete from director where id = ?;";
    private static final String UPDATE_DIRECTOR_SQL = "update director set name_director = ?,image_director=? where id=?;";

    //private static final String SEARCH_DIRECTORNAME_NATIONNAME_BYID = "";
    private static final String SEARCH_MOVIE_BY_IDDIRECTOR = "select  movie.name_movie from movie join director on movie.id_director = director.id_director = ?;";
    public Director_DAO(){

    }

    public void insertDirector(Director director) throws SQLException {
        System.out.println(INSERT_DIRECTOR_SQL);
        try ( PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DIRECTOR_SQL)) {
            preparedStatement.setString(1, director.getName_director());
            preparedStatement.setString(2, director.getImage_director());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Director selectDirector(int id_director) {
        Director director = null;
        // Step 1: Establishing a Connection
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DIRECTOR_BY_ID);) {
            preparedStatement.setInt(1, id_director);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name_director = rs.getString("name_director");
                String image_director = rs.getString("image_director");
                director = new Director(id_director, name_director, image_director);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return director;
    }

    public List<Director> selectAllDirector() {
        List<Director> directors = new ArrayList<>();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DIRECTOR);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id_director = rs.getInt("id_director");
                String name_director = rs.getString("name_director");
                String image_director = rs.getString("image_director");
                directors.add(new Director(id_director, name_director, image_director));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return directors;
    }


    public boolean deleteDirector(int id_director) throws SQLException {
        boolean rowDeleted;
        try ( PreparedStatement statement = connection.prepareStatement(DELETE_DIRECTORS_SQL);) {
            statement.setInt(1, id_director);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    public boolean updateDirector(Director director) throws SQLException {
        boolean rowUpdated;
        try (PreparedStatement statement = connection.prepareStatement(UPDATE_DIRECTOR_SQL);) {
            statement.setString(1, director.getName_director());
            statement.setString(2, director.getImage_director());
            statement.setInt(3,director.getId_director());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
