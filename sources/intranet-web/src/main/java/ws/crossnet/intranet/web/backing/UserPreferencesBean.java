package ws.crossnet.intranet.web.backing;

import java.text.MessageFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ianache
 */
@ManagedBean(name="userPreferencesBean")
@ViewScoped
public class UserPreferencesBean {
    private static final Logger logger = LoggerFactory.getLogger(UserPreferencesBean.class);
    private UserDetails userDetails;
    
    public UserPreferencesBean() {
        if(userDetails == null) {
            userDetails = new UserDetails();
        }
    }
    
    public String save() {
        logger.info(MessageFormat.format("Saving User Preferences for {0} {1} {2}", userDetails.getName(), userDetails.getMiddleName(), userDetails.getLastName()));
        return "";
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
    
    
}
