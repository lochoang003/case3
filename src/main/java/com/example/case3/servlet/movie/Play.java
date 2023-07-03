package com.example.case3.servlet.movie;

import com.example.case3.dao.Movie_DAO;
import com.example.case3.model.Movie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/play")
public class Play extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id_Movie"));
        Movie movie = new Movie_DAO().selectMovie(id);
        new Movie_DAO().updateView(id);
        req.setAttribute("movie",movie);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Movie/play.jsp");
        dispatcher.forward(req,resp);
    }
}
