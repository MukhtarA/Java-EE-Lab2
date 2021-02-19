package Lab2.Lab2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registration", value = "/registration")
public class RegistrationServlet extends HttpServlet {

    public RegistrationServlet(){
        super();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
        String surname = request.getParameter("surname");
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        RegistrationBean registrationBean = new RegistrationBean();
        registrationBean.setSurname(surname);
        registrationBean.setName(name);
        registrationBean.setUsername(username);
        registrationBean.setPassword(password);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<div align=\"center\">");
        out.println("<h1>Registration complete</h1>");
        out.println("<h4>Surname: " + surname + "</h4>");
        out.println("<h4>Name: " + name + "</h4>");
        out.println("<h4>Username: " + username + "</h4>");
        out.println("<h4>Password: " + password + "</h4>");
        out.println("<a href=\"index.jsp\">Home</a>");
        out.println("</div>");
        out.println("</body></html>");

    }
}
