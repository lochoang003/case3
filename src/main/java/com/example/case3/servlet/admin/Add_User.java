package com.example.case3.servlet.admin;

import com.example.case3.dao.Users_DAO;
import com.example.case3.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Add_User")
public class Add_User extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users_DAO temp = new Users_DAO();
        temp.insertUser(new Users(req.getParameter("name_users"), req.getParameter("acc"), req.getParameter("pass"), req.getParameter("date_created"), req.getParameter("role")));
        resp.sendRedirect("/Home_User");
    }
}
