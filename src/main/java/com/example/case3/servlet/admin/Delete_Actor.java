package com.example.case3.servlet.admin;

import com.example.case3.dao.Actor_DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Delete_Actor")
public class Delete_Actor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Actor_DAO aa = new Actor_DAO();
            aa.deleteActor(Integer.parseInt(req.getParameter("id")));
            resp.sendRedirect("/Home_Actor");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
