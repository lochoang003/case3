package com.example.case3.servlet.admin;

import com.example.case3.dao.Actor_DAO;
import com.example.case3.model.Actor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Update_Actor")
public class Update_Actor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Actor_DAO aa = new Actor_DAO();
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name_Actor");
            byte age = Byte.parseByte(req.getParameter("age"));
            String img = req.getParameter("image_Actor");
            aa.updateActor(new Actor(id, name, age, img));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}