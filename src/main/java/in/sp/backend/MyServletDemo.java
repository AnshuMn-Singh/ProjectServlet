package in.sp.backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServletDemo extends HttpServlet {

    @Override
    protected void doGet ( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        PrintWriter out = response.getWriter ();
        out.print ("hello servlet");

        System.out.println ("redcap");
    }
}
