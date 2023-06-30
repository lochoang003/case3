package com.example.case3.dao;


import com.example.case3.model.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Users_DAO {
    private static final String SELECT_ALL_SQL = "select * from `movie`.`users`;";
    private static final String INSERT_USERS_SQL = "INSERT INTO  `movie`.`users` (name_users,acc,pass,date_created) VALUES (?,?,?,?);";
    private static final String SET_PASS_SQL = "UPDATE `movie`.`users` SET `pass` = '?' WHERE (`id_users` = '?');";
    private static final String SELECT_ID_SQL = "select `id` from `movie`.`users`;";
    DAO dao = new DAO();
    Connection connection = dao.getConnection();
    public  List<Users> getAll_users(){
        List<Users> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_SQL);
            while (resultSet.next()){
                int id = resultSet.getInt("id_users");
                String name = resultSet.getString("name_users");
                String acc = resultSet.getString("acc");
                String pass = resultSet.getString("pass");
                String date_created = resultSet.getString("date_created");
                byte status = resultSet.getByte("status");
                String role = resultSet.getString("role");
                users.add(new Users(id,name,acc,pass,date_created,status,role));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }

    public void insertAccSql(Users users) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, users.getName());
            preparedStatement.setString(2, users.getAcc());
            preparedStatement.setString(3, users.getPass());
            preparedStatement.setString(4, users.getDate_created());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setPassSql(Users users) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SET_PASS_SQL)) {
            preparedStatement.setString(1, users.getPass());
            preparedStatement.setInt(2, users.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public Users getLogin(String user, String pass) {
        try {
            String sql = "select * from `movie`.`users` where `acc`= ? and `pass`= ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user);
            statement.setString(2, pass);
            ResultSet resultSet = statement.executeQuery();

            resultSet.next();
            int id = resultSet.getInt("id_users");
            String name = resultSet.getString("name_users");
            String date_created = resultSet.getString("date_created");
            byte status = resultSet.getByte("status");
            String role = resultSet.getString("role");

            return new Users(id,name, user, pass,date_created,status, role);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
