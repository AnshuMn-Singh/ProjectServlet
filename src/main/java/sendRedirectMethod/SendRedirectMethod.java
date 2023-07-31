package sendRedirectMethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("searchPage1")
public class SendRedirectMethod extends HttpServlet {
    @Override
    protected void service ( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {

        String mySearch = req.getParameter ("search1");

//        resp.sendRedirect ("https://www.google.com");
    }
}
