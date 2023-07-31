package httpMethods;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submitForm")
public class RequestAndResponseMethods extends HttpServlet {
    @Override
    protected void service ( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        String name1 = req.getParameter ("name1");
        String email1 = req.getParameter ("email1");

        System.out.println ("Name : " + name1 + " Email :  " + email1);
        PrintWriter pw = resp.getWriter ();
        pw.println ("Name : " + name1);
        pw.println ("Email : " + email1);
    }
}
