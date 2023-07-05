package com.example.case3.servlet.admin;

import com.example.case3.dao.Actor_DAO;
import com.example.case3.model.Actor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Add_Actor")
public class Add_Actor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Actor_DAO aa = new Actor_DAO();
            String name = req.getParameter("name_Actor");
            byte age = Byte.parseByte(req.getParameter("age"));
            String img = req.getParameter("image_Actor");
            aa.insertActor(new Actor(name, age, img));
            resp.sendRedirect("/Home_Actor");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
