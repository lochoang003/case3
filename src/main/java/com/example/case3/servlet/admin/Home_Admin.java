package com.example.case3.servlet.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin")
public class Home_Admin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nameAdmin");
        req.setAttribute("user",name);
        RequestDispatcher rd = req.getRequestDispatcher("/Admin/admin.jsp");
                rd.forward(req, resp);
    }
}
