package com.example.case3.servlet.users;

import com.example.case3.dao.Users_DAO;
import com.example.case3.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    Users_DAO accDao = new Users_DAO();
    private final byte ON = 1;
    private final byte OFF = 0;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        Users users = accDao.getLogin(user, pass);
        if (users != null) {
            HttpSession session = req.getSession();
            session.setAttribute("account", users);

            if (users.getRole().equals("client") && users.getStatus() == ON) {
                resp.sendRedirect("/HOME/home.jsp");
            } else if (users.getRole().equals("client") && users.getStatus() == OFF) {
                req.setAttribute("err", "your account has been locked");
                resp.sendRedirect("/SignIn/SignIn.jsp");
            } else if (users.getRole().equals("addmin") && users.getStatus() == ON) {
                resp.sendRedirect("/addmin");
            } else {
                resp.sendRedirect("/demo.jsp");
            }
        } else {
            resp.sendRedirect("/demo.jsp");
        }
    }
}
