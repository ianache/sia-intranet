package ws.crossnet.intranet.web.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 *
 * @author ianache
 */
@Component
@ManagedBean(name="userDetailsBean")
@ViewScoped
public class UserDetailsBean {

    public Authentication getLoggedUserInfo() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
    
    public String getLoggedUser() throws Exception {
        Authentication user = SecurityContextHolder.getContext().getAuthentication();
        String name = user.getName();
        return (!name.equals("anonymousUser")) ? name : null;
    }
}
