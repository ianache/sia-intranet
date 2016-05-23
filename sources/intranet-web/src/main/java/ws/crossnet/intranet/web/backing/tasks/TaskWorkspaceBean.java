package ws.crossnet.intranet.web.backing.tasks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author ianache
 */
@Component
@ManagedBean(name="taskWorkspaceBean")
@ViewScoped
public class TaskWorkspaceBean  implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(TaskWorkspaceBean.class);
    
    private Collection<TaskSummaryBean> myTasks = null;

    public TaskWorkspaceBean() {
        super();
        myTasks = new ArrayList<>();
        myTasks.add(new TaskSummaryBean("1", "Revisar alcance del proyecto", "ianache", Calendar.getInstance().getTime(),"Initiated"));
    }    

    public Collection<TaskSummaryBean> getMyTasks() {
        logger.info("Getting My Tasks");
        return myTasks;
    }
    
    public String initiate(String taskId) {
        logger.info("Initiate task " + taskId);
        return "";
    }

    public String execute(String taskId) {
        logger.info("Execute task " + taskId);
        return "";
    }

    public String delegate(String taskId) {
        logger.info("Delegating task " + taskId);
        return "";
    }
    
    public String release(String taskId) {
        logger.info("Releasing task " + taskId);
        return "";
    }
    
    public String claim(String taskId) {
        logger.info("Claiming task " + taskId);
        return "";
    }
    
    public Integer getTasksCount() {
        return 1;
    }
}
