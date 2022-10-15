package com.cybersoft.controller;

import com.cybersoft.service.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registerpage", urlPatterns = {"/register"})
public class RegisterPage extends HttpServlet {

    private RegisterService registerService = new RegisterService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/webapp/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean isRegister = false;
        isRegister = registerService.checkRegister(username,password);

        if (isRegister){
            resp.sendRedirect(req.getContextPath()+"/login");
        } else {
            req.setAttribute("error","Username has already exist");
            req.getRequestDispatcher("/webapp/register.jsp").forward(req,resp);
        }


    }
}
