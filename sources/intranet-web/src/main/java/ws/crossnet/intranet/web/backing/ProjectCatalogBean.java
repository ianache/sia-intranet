package ws.crossnet.intranet.web.backing;

import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ws.crossnet.sia.projectmanagement.application.QueryProjectManagementApplicationService;
import ws.crossnet.sia.projectmanagement.application.representation.ProjectSummary;

/**
 *
 * @author ianache
 */
@Component
@ManagedBean(name="projectCatalogBean")
@ViewScoped
public class ProjectCatalogBean {
    private static final Logger logger = LoggerFactory.getLogger(ProjectCatalogBean.class);
    
    @Autowired QueryProjectManagementApplicationService queryProjectManagementApplicationService;
    
    public Collection<ProjectSummary> getProjects() {
        /*Collection<ProjectSummary> projects = new ArrayList<>();
        projects.add(new ProjectSummary("FABP2", "aaaa-bbbb-cccccccc-dsed", "Servicios de Homologacion", "Servicios de Homologacion", ProjectStateEnum.Created));
        projects.add(new ProjectSummary("FABP4", "aaaa-bbbb-cccccccc-98ab", "Servicios Estándares", "Servicios Estándares", ProjectStateEnum.Created));
        projects.add(new ProjectSummary("FABFI", "1111-bbbb-cccccccc-98ab", "Soporte FOW IB SOA", "Soporte FOW IB SOA", ProjectStateEnum.Canceled));*/
        return queryProjectManagementApplicationService.queryAllRegisteredProjects();
        //return projects;
    }
}
