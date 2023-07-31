package httpMethods;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myLogin")
public class httpMethods  extends HttpServlet {
    @Override
    protected void service ( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter ();

        String email = req.getParameter ("email1");
        String pass = req.getParameter ("pass1");

        if(email.equals ("1@1") && pass.equals ("11")){
            System.out.println ("success");
            pw.println ("login successful");
        }else {
            System.out.println ("failed");
            pw.println ("login failed");
        }
    }
}
