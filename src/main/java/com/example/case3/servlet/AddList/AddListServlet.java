package com.example.case3.servlet.AddList;

import com.example.case3.dao.Movie_DAO;
import com.example.case3.model.Movie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddList")
public class AddListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id_add = Integer.parseInt(req.getParameter("id_add"));
        Movie movie = new Movie_DAO().addToList(id_add);
        req.setAttribute("movie",movie);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/home");
        requestDispatcher.forward(req,resp);

    }
}
