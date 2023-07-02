package com.example.case3.servlet.admin;

import com.example.case3.dao.Users_DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminDelUser")
public class Delete_User extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Users_DAO temp = new Users_DAO();
            temp.delByID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
