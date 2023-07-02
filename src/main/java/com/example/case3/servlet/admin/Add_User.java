package com.example.case3.servlet.admin;

import com.example.case3.dao.Users_DAO;
import com.example.case3.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminAddUser")
public class Add_User extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name_users");
        String acc = req.getParameter("acc");
        String pass = req.getParameter("pass");
        String date_created = req.getParameter("date_created");
        Users_DAO temp = new Users_DAO();
        temp.insertAccSql(new Users(name, acc, pass, date_created));
    }
}
