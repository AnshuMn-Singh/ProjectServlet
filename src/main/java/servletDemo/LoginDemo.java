package servletDemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginDemo extends HttpServlet {
    @Override
    protected void doGet ( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        System.out.println ("i am in servlet login method");
    }
}
