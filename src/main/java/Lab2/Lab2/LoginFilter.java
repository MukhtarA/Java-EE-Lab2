package Lab2.Lab2;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,new CustomWrapper((HttpServletResponse) servletResponse));
    }

    class CustomWrapper extends HttpServletResponseWrapper {
        public CustomWrapper(HttpServletResponse response) {
            super(response);
            System.out.println(response.toString().toUpperCase());
        }
    }
    @Override
    public void destroy() {

    }
}
