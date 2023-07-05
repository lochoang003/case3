package com.example.case3.servlet.admin;

import com.example.case3.dao.Movie_DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Delete_Movie")
public class Delete_Movie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Movie_DAO temp = new Movie_DAO();
            temp.remoteMovie(id);
            resp.sendRedirect("/HomeMovie");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
