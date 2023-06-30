package com.example.case3.servlet.users;

import com.example.case3.dao.Users_DAO;
import com.example.case3.model.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/signUp")
public class SignUp extends HttpServlet {
    Users_DAO usersDao = new Users_DAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/SignIn/SignUp.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name_users");
        String pass = req.getParameter("pass");
        String acc = req.getParameter("acc");
        Date date = new Date();
        String date_created = String.valueOf(date);
        if (checkUser(acc)) {
            req.setAttribute("err", "Account already exists ");
            RequestDispatcher rd = req.getRequestDispatcher("/SignIn/SignUp.jsp");
            rd.forward(req, resp);

        } else {
            Users users = new Users(name, acc, pass, date_created);
            usersDao.insertAccSql(users);
            resp.sendRedirect("/SignIn/SignIn.jsp");
        }
    }

    private boolean checkUser(String acc) {
        for (Users users : usersDao.getAll_users()) {
            if (users.getAcc().equals(acc)) {
                return true;
            }
        }
        return false;
    }

}
