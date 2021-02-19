package Lab2.Lab2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

    public LoginServlet(){
        super();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Cookie[] cookies = request.getCookies();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<div align=\"center\">");
        out.println("<h1>Login complete</h1>");
        out.println("<h4>Username: " + username + "</h4>");
        out.println("<h4>Password: " + password + "</h4>");
        out.println("<a href=\"index.jsp\">Home</a>");
        out.println("</div>");
        out.println("</body></html>");

        Cookie cookie = new Cookie(username,password);
        response.addCookie(cookie);
        cookie.setMaxAge(1800);
        for (Cookie cook : cookies){
            System.out.println(cook.getName());
            System.out.println(cook.getValue());
        }


    }
}
