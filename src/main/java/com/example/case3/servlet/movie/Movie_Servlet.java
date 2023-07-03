package com.example.case3.servlet.movie;

import com.example.case3.dao.Actor_DAO;
import com.example.case3.dao.Movie_DAO;
import com.example.case3.model.Movie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/movie")
public class Movie_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id_movie12"));
        Movie movie = new Movie_DAO().selectMovie(id);
        String actor_Name = new Actor_DAO().selectActor(id);
        req.setAttribute("movie",movie);
        req.setAttribute("actor_Name",actor_Name);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Movie/Movie.jsp");
        dispatcher.forward(req,resp);
    }
}
