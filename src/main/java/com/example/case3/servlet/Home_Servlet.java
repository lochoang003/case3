package com.example.case3.servlet;

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

@WebServlet("/home")
public class Home_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Genre> genres = new Genre_DAO().selectAllGenre();
        List<Movie> movies = new Movie_DAO().getAllMovieGenre();
        List<Movie> trending = new Movie_DAO().getTrending();
        List<Movie> G18 = new Movie_DAO().getMovieByGenre(1);
            req.setAttribute("genres",genres);
            req.setAttribute("movies",movies);
            req.setAttribute("trending",trending);
            req.setAttribute("G18",G18);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/HOME/home.jsp");
            dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Genre> genres = new Genre_DAO().selectAllGenre();
        List<Movie> movies = new Movie_DAO().getAllMovieGenre();
        List<Movie> trending = new Movie_DAO().getTrending();
        List<Movie> G18 = new Movie_DAO().getMovieByGenre(1);
        List<Movie> movie_genre = (List<Movie>) req.getAttribute("movie_genre");
        req.setAttribute("movie_genre",movie_genre);
        req.setAttribute("name_genre",req.getAttribute("name_genre"));
        req.setAttribute("genres",genres);
        req.setAttribute("movies",movies);
        req.setAttribute("trending",trending);
        req.setAttribute("G18",G18);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/HOME/home.jsp");
        dispatcher.forward(req,resp);
    }
}
