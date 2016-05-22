package ws.crossnet.intranet.web.backing.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ws.crossnet.sia.projectmanagement.application.commands.ApproveProjectCommand;
import ws.crossnet.sia.projectmanagement.application.commands.CancelProjectCommand;
import ws.crossnet.sia.projectmanagement.application.commands.RemoveProjectCommand;
import ws.crossnet.sia.projectmanagement.application.commands.ResumeProjectCommand;
import ws.crossnet.sia.projectmanagement.application.commands.StartProjectExecution;
import ws.crossnet.sia.projectmanagement.application.commands.SupendProjectCommand;
import ws.crossnet.sia.projectmanagement.application.representation.ProjectSummary;
import ws.crossnet.sia.projectmanagement.domain.model.DomainRegistry;

/**
 *
 * @author ianache
 */
@Component
@ManagedBean(name="projectCatalogBean")
@ViewScoped
public class ProjectCatalogBean {
    private static final Logger logger = LoggerFactory.getLogger(ProjectCatalogBean.class);
    
    //@Autowired QueryProjectManagementApplicationService queryProjectManagementApplicationService;
    
    public Collection<ProjectSummary> getProjects() {
        try {
            logger.info("Getting projects");
            return DomainRegistry.queryProjectApplicationService().queryAllRegisteredProjects();
        } catch(Exception ex) {    
            logger.error(ex.getMessage());
        }
        return new ArrayList<>();
    }
    
    public String approve(String projectId) {
        logger.info("Approving the project: " + projectId);
        ApproveProjectCommand cmd = new ApproveProjectCommand(projectId, "ianache");
        DomainRegistry.projectApplicationService().approveProject(cmd);
        return "";
    }
    
    public String cancel(String projectId) {
        logger.info("Canceling the project: " + projectId);
        CancelProjectCommand cmd = new CancelProjectCommand(projectId, "ianache", "No reason");
        //DomainRegistry.projectApplicationService().cancelProject(cmd);
        return "";
    }

    public String open(String projectId) {
        logger.info("Open the project: " + projectId);
        return "openproject";
    }

    public String suspend(String projectId) {
        logger.info("Suspending the project: " + projectId);
        SupendProjectCommand cmd = new SupendProjectCommand(projectId, "ianache", "No reason");
        DomainRegistry.projectApplicationService().suspendProject(cmd);
        return "openproject";
    }
    
    public String delete(String projectId) {
        logger.info("Deliting the project: " + projectId);
        RemoveProjectCommand cmd = new RemoveProjectCommand(projectId, "ianache", "No reason");
        DomainRegistry.projectApplicationService().removeProject(cmd);
        return "openproject";
    }

    public String restart(String projectId) {
        logger.info("Restarting the project: " + projectId);
        ResumeProjectCommand cmd = new ResumeProjectCommand(projectId, "ianache");
        DomainRegistry.projectApplicationService().resumeProject(cmd);
        return "openproject";
    }

    public String start(String projectId) {
        logger.info("Starting the project: " + projectId);
        StartProjectExecution cmd = new StartProjectExecution(projectId, "ianache");
        DomainRegistry.projectApplicationService().startProjectExecution(cmd);
        return "openproject";
    }
    
    public void newProject() {
        Map<String,Object> options = new HashMap<>();
        options.put("resizable", false);
        options.put("draggable", false);
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("project/new", options, null);
    }
}
