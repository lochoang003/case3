package com.example.case3.servlet.admin;

import com.example.case3.dao.Actor_DAO;
import com.example.case3.model.Actor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Home_Actor")
public class Home_Actor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Actor_DAO aa = new Actor_DAO();
            ArrayList<Actor> list = (ArrayList<Actor>) aa.selectAllActor();
            req.setAttribute("actor", list);
            RequestDispatcher rd = req.getRequestDispatcher("Admin/Actor.jsp");
            rd.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
