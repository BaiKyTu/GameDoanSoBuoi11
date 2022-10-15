package com.cybersoft.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "homepage", urlPatterns = {"/home-page"})
public class HomePage extends HttpServlet {
    int randomNum ;
    @Override
    public void init() throws ServletException {
        int min = 1;
        int max = 100;

        //Generate random int value from 1 to 100
        System.out.println("Random value in int from "+min+" to "+max+ ":");
         randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        //randomNum = ThreadLocalRandom.current().nextInt(1, 100);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet: " + randomNum);
        req.setAttribute("randomNum",randomNum);
        req.getRequestDispatcher("/webapp/homepage.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int number = Integer.parseInt(req.getParameter("number"));
        req.setAttribute("number", number);

        if (number == randomNum) {
            req.setAttribute("message", "Bạn đã đoán chính xác! Số bí mật là " + number);
        } else if (number < randomNum) {
            req.setAttribute("message", "Số nhập vào NHỎ hơn số bí mật. Mời nhập lại!");
        } else if (number > randomNum) {
            req.setAttribute("message", "Số nhập vào LỚN hơn số bí mật. Mời nhập lại!");
        }
        req.getRequestDispatcher("/webapp/homepage.jsp").forward(req, resp);
    }
}
