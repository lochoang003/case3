package com.example.case3.dao;

import java.sql.Connection;

public class Nation_DAO {
    DAO dao = new DAO();
    Connection connection = dao.getConnection();
}
