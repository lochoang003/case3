package com.example.case3.servlet.genres;

import com.example.case3.dao.Genre_DAO;
import com.example.case3.dao.Movie_DAO;
import com.example.case3.model.Genre;
import com.example.case3.model.Movie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/genre")
public class Genre_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id_genre = Integer.parseInt(req.getParameter("genre_id"));
        String name_genre = req.getParameter("genre_name");
        List<Movie> movies = new Movie_DAO().getMovieByGenre(id_genre);
        req.setAttribute("movie_genre",movies);
        req.setAttribute("name_genre",name_genre);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/home");
        requestDispatcher.forward(req,resp);

    }
}
