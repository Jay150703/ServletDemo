package com.jay;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if(!username.matches("[A-Z][a-zA-Z]{2,}"))
        {
            out.println("Invalid Name");
            return;
        }

        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=[^@#$%^&*]*[@#$%^&*][^@#$%^&*]*$).{8,}$";

        if(!password.matches(regex))
        {
            out.println("Invalid Password");
            return;
        }

        out.println("Login Successful");
    }
}