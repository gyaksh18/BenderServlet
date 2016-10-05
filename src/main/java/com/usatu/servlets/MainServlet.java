package com.usatu.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created as methodical material for ACS department.
 */

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reqAttribute = req.getParameter("age");
        try {
            int age = Integer.parseInt(reqAttribute);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int currentYear = calendar.get(Calendar.YEAR);
            String answer;
            if (age >= currentYear){
                answer = (age - currentYear + 1) + " год до н.э.";
            } else {
                answer = (currentYear - age) + " год н.э";
            }
            req.setAttribute("answer", "Ваш год рождения - " +  answer);
        } catch (NumberFormatException exception) {
            req.setAttribute("answer", "- Нужно написать цифрами. Попробуйте снова.");
        }
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
