package com.example.case3.servlet.admin;

import com.example.case3.dao.Movie_DAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HomeMovie")
public class Home_Movie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Movie_DAO md = new Movie_DAO();
        req.setAttribute("movie", md.getAllMovieGenre());
        System.out.println(md.getAllMovieGenre().size());
        RequestDispatcher rd = req.getRequestDispatcher("/Admin/Movie.jsp");
        rd.forward(req, resp);
    }
}
