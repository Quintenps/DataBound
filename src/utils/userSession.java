package utils;

/**
 * Created by 187z on 6/6/2016.
 */
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Filter;


public class userSession implements javax.servlet.Filter {

    public void init(FilterConfig arg0) throws ServletException {
    /* Filter is being placed into service, do nothing. */
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest r2 = (HttpServletRequest) req;
        if (r2.getSession().getAttribute("loggedUser") == null) {
            r2.getRequestDispatcher("/portal/login.jsp").forward(req, resp);
        } else {
            chain.doFilter(req, resp);
        }
    }

    public void destroy() {
    /* Filter is being taken out of service, do nothing. */
    }
}

