package ws.crossnet.intranet.web.backing;

import java.io.Serializable;

/**
 *
 * @author ianache
 */
public class UserDetails implements Serializable {
    private String name;
    private String middleName;
    private String lastName;
    private String password;

    public UserDetails() {
        super();
    }

    public UserDetails(String name, String middleName, String lastName, String password) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
}
