package com.example.case3.servlet.genres;

import com.example.case3.dao.Genre_DAO;
import com.example.case3.model.Genre;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/genres")
public class Genre_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Genre> genres = new Genre_DAO().selectAllGenre();
        req.setAttribute("genres",genres);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/HOME/home.jsp");
        dispatcher.forward(req,resp);

    }
}
