package ws.crossnet.intranet.we.security;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ianache
 */
public class CrossnetSecurityFilter /*implements javax.servlet.Filter*/ {
    public static final Logger logger = LoggerFactory.getLogger(CrossnetSecurityFilter.class);
    /*
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("Entering CROSSNET Security Filter init");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.debug("Entering CROSSNET Security Filter doFilter");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.debug("Entering CROSSNET Security Filter destroy");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
