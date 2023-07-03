package com.example.case3.dao;

import com.example.case3.model.Actor;
import com.example.case3.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Actor_DAO {
    DAO dao = new DAO();
    private static final String INSERT_ACTOR_SQL = "INSERT INTO `movie`.`actor` ( `name_Actor`, `age`, `image_Actor`) VALUES ('?', '?', '?')";
    private static final String SELECT_ACTOR_BY_ID = "SELECT id_Actor,name_Actor,age,image_Actor from `movie`.`actor` where id = ?";
    private static final String SELECT_ALL_ACTOR = "SELECT * FROM `movie`.`actor`";
    private static final String DELETE_ACTOR = "DELETE FROM `movie`.`actor` WHERE ID = ? ";
    private static final String SELECT_ACTOR = "SELECT name_Actor FROM actor JOIN actors on actor.id_Actor = actors.id_Actor " +
            "JOIN movie on movie.id_movie = actors.id_movie WHERE movie.id_movie = ?";
    private static final String UPDATE_ACTOR = "UPDATE `movie`.`actor` SET `name_Actor` = ?, `age` = ?, `image_Actor` = ? WHERE (`id_Actor` = '1')";

    public Actor_DAO() {
    }

    Connection connection = dao.getConnection();

    public void insertActor(Actor actor) throws SQLException {
        System.out.println(INSERT_ACTOR_SQL);
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACTOR_SQL)) {
            preparedStatement.setString(1, actor.getName_Actor());
            preparedStatement.setInt(2, actor.getAge());
            preparedStatement.setString(3, actor.getImage_Actor());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String selectActor(long id){
        String name_Actor = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACTOR)) {
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                name_Actor += rs.getString("name_Actor" ) + " , ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name_Actor;
    }

//    public List<Actor> selectAllActor() {
//        List<Actor> actors = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ACTOR);
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                int id_Actor = rs.getInt("id_Actor");
//                String name_Actor = rs.getString("name_Actor");
//                int age = rs.getInt("age");
//                String image_Actor = rs.getString("image_Actor");
//                actors.add(new Actor(id_Actor, name_Actor, (byte) age, image_Actor));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return actors;
//    }

//    public Actor selectActor(int id) {
//        Actor actor = null;
//        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACTOR_BY_ID)) {
//            preparedStatement.setInt(1, id);
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                String name_Actor = rs.getString("name_Actor");
//                Byte age = rs.getByte("age");
//                String image_Actor = rs.getString("image_Actor");
//                actor = new Actor(id, name_Actor, age, image_Actor);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return actor;
//    }
//    public boolean deleteActor(int id) throws SQLException{
//        boolean rowDeleted;
//        try(PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ACTOR)){
//            preparedStatement.setInt(1,id);
//            rowDeleted = preparedStatement.executeUpdate() >0;
//        }
//        return rowDeleted;
//    }
    public boolean updateActor(Actor actor) throws SQLException{
        boolean rowUpdated;
        try(PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ACTOR)){
            preparedStatement.setString(1,actor.getName_Actor());
            preparedStatement.setByte(2,actor.getAge());
            preparedStatement.setString(3,actor.getImage_Actor());
            preparedStatement.setInt(3,actor.getId_Actor());
            rowUpdated = preparedStatement.executeUpdate() >0;
        }
        return rowUpdated;
    }
}
