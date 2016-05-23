package ws.crossnet.intranet.web.backing.tasks;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ianache
 */
public class TaskSummaryBean  implements Serializable {
    private String taskId;
    private String title;
    private String assignee;
    private Date dueDate;
    private String state;

    public TaskSummaryBean() {
        super();
    }

    public TaskSummaryBean(String taskId, String title, String assignee, Date dueDate, String state) {
        this.taskId = taskId;
        this.title = title;
        this.assignee = assignee;
        this.dueDate = dueDate;
        this.state = state;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
