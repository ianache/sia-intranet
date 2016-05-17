package ws.crossnet.intranet.database;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author ianache
 */
public class DerbyDataFactory implements ServletContextListener {

    private DatasourceObject datasourceObject;
    //private ServletContext servletContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //servletContext = sce.getServletContext();
        this.datasourceObject = new DerbyDatabase();
        this.datasourceObject.initialize("f:/temp/derby");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        datasourceObject.shutdown();
    }
}

