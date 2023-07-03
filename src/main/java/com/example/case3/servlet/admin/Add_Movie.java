package com.example.case3.servlet.admin;

import com.example.case3.dao.Movie_DAO;
import com.example.case3.model.Movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminAddMovie")
public class Add_Movie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Movie_DAO temp = new Movie_DAO();
            temp.insertMovie(new Movie(req.getParameter("name"),
                    Integer.parseInt(req.getParameter("time")),
                    req.getParameter("broadcast"),
                    req.getParameter("Manufacture"),
                    req.getParameter("Summary"),
                    req.getParameter("Img"),
                    req.getParameter("Video"),
                    req.getParameter("Nation"),
                    req.getParameter("Director")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
