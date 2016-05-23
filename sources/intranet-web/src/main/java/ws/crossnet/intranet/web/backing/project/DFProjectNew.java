package ws.crossnet.intranet.web.backing.project;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author ianache
 */
@ManagedBean(name = "dfProjectNew")
@ViewScoped
public class DFProjectNew implements Serializable  {
    private String code;
    private String title;
    private String description;
    private String categoryId;

    public DFProjectNew() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
    
    public void save() {
         RequestContext.getCurrentInstance().closeDialog(null);
    }
}
