package com.cybersoft.controller;

import com.cybersoft.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginPage extends HttpServlet {

    private LoginService loginService = new LoginService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("webapp/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean isLogin = false;
        isLogin = loginService.checkLogin(username,password);

        if (isLogin){
            resp.sendRedirect(req.getContextPath()+"/home-page");
        } else {
            req.setAttribute("message","Wrong Username or Password");
            req.getRequestDispatcher("/webapp/login.jsp").forward(req,resp);
        }
    }
}
