package com.example.case3.servlet.admin;

import com.example.case3.dao.Users_DAO;
import com.example.case3.model.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Home_User", value = "/Home_User")
public class Home_User extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Users_DAO temp = new Users_DAO();
            ArrayList<Users> list = (ArrayList<Users>) temp.getAll_users();
            req.setAttribute("user", list);
            HttpSession session = req.getSession();
            Users users = (Users) session.getAttribute("account");
            req.setAttribute("name", users.getName());
            RequestDispatcher rd = req.getRequestDispatcher("Admin/User.jsp");
            rd.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
