package com.example.case3.dao;

import java.sql.Connection;

public class Nation_DAO {
    DAO dao = new DAO();
    Connection connection = dao.getConnection();
    private static final String INSERT_NATION_SQL = "INSERT INTO nation(id_nation,name_nation) VALUES (?,?);";
    private static final String SELECT_NATION_BY_ID = "select id_nation,name_nation from nation where id = ?";
    private static final String SELECT_ALL_NATION = "select * from nation";
    private static final String DELETE_NATION_SQL = "delete from nation where id = ?;";
    private static final String UPDATE_NATION_SQL = "update nation set name_nation = ? where id=?;";
    private static final String SEARCH_MOVIE_BY_NATIONID = "select movie.name_movie from movie join nation on movie.id_nation = nation.id_nation = ?;";

    public Nation_DAO(){

    }

    public void insertNation(Nation nation) throws SQLException {
        System.out.println(INSERT_NATION_SQL);
        try ( PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NATION_SQL)) {
            preparedStatement.setString(1, nation.getName_nation());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public Nation selectNation(int id_nation) {
        Nation nation = null;
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NATION_BY_ID);) {
            preparedStatement.setInt(1, id_nation);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name_nation = rs.getString("name_nation");
                nation = new Nation(id_nation, name_nation);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return nation;
    }

//    public Nation searchMovie_by_NationId(int id_Nation){
//         Nation nation = null;
//         Movie movie = null;
//        try(PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_MOVIE_BY_NATIONID);){
//            preparedStatement.setInt(1, id_Nation);
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()){
//                String name_Movie = rs.getString("name_movie");
//                movie = new Movie(name_Movie);
//            }
//        }catch (SQLException e){
//            printSQLException(e);
//        }
//    }

    public List<Nation> selectAllNation() {
        List<Nation> nations = new ArrayList<>();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_NATION);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id_nation = rs.getInt("id_nation");
                String name_nation = rs.getString("name_nation");
                nations.add(new Nation(id_nation, name_nation));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nations;
    }


    public boolean deleteNation(int id_nation) throws SQLException {
        boolean rowDeleted;
        try ( PreparedStatement statement = connection.prepareStatement(DELETE_NATION_SQL);) {
            statement.setInt(1, id_nation);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    public boolean updateNation(Nation nation) throws SQLException {
        boolean rowUpdated;
        try (PreparedStatement statement = connection.prepareStatement(UPDATE_NATION_SQL);) {
            statement.setString(1, nation.getName_nation());
            statement.setInt(2,nation.getId_nation());

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
