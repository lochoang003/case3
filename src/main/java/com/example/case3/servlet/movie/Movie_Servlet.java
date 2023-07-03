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
import java.util.List;

@WebServlet("/movie")
public class Movie_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Movie/Movie.jsp");
        List<Movie> movies = new Movie_DAO().selectAllMovie();
        req.setAttribute("movies",movies);
        dispatcher.forward(req,resp);
    }
}
