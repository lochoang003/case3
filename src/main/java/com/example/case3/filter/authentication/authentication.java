package com.example.case3.filter.authentication;

import com.example.case3.model.Users;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter({"/admin", "/HOME/home.jsp", "/admin/*"})
public class authentication extends HttpFilter {
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        Users account = (Users) session.getAttribute("account");
        if (account != null){
            chain.doFilter(req,res);
        }else {
            res.sendRedirect("/SignIn/SignIn.jsp");
        }
    }
}
