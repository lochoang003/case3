package com.example.case3.dao;

import com.example.case3.model.Genre;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Genre_DAO  {


    private static final String INSERT_GENRE_SQL = "INSERT INTO  `movie`.`genre` (name) VALUES (?);";
    private static final String SELECT_GENREBY_ID = "select id,name from `movie`.`genre` where id =?";
    private static final String SELECT_ALL_GENRE = "select * from `movie`.`genre`";
    private static final String DELETE_GENRE_SQL = "delete from `movie`.`genre` where id = ?;";
    private static final String UPDATE_GENRE_SQL = "update `movie`.`genre` set name = ? where id = ?;";

    public Genre_DAO() {
    }
     DAO dao = new DAO();
    Connection connection = dao.getConnection();


    public void insertGenre(Genre genre) throws SQLException {
        System.out.println(INSERT_GENRE_SQL);
        try ( PreparedStatement preparedStatement = connection.prepareStatement(INSERT_GENRE_SQL)) {
            preparedStatement.setString(1, genre.getName());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Genre selectGenre(int id) {
        Genre genre = null;

        try (
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_GENREBY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                genre = new Genre(id, name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return genre;
    }

    public List<Genre> selectAllGenre() {
        List<Genre> users = new ArrayList<>();
        try (

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_GENRE);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                users.add(new Genre(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public boolean deleteGenre(int id) throws SQLException {
        boolean rowDeleted;
        try ( PreparedStatement statement = connection.prepareStatement(DELETE_GENRE_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}
