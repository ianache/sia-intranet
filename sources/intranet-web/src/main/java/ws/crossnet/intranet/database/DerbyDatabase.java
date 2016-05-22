package ws.crossnet.intranet.database;

import java.sql.SQLException;
import org.apache.derby.jdbc.EmbeddedDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ianache
 */
public class DerbyDatabase /*implements DatasourceObject*/ {
/*
    private static final Logger logger = LoggerFactory.getLogger(DerbyDatabase.class);
    private Boolean isInitialized = false;
    private Boolean isShutdown = false;
    private static final String databaseName = "sia";
    private static EmbeddedDataSource ds = null;

    @Override
    public void initialize(String pathtoResource) {
        if (isInitialized) {
            return;
        }

        try {
            if (ds == null) {
                ds = new EmbeddedDataSource();
                ds.setDatabaseName(pathtoResource + "/" + databaseName);
                logger.info("Setting Apache Derby Datasource " + ds.getDatabaseName());
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }

        isInitialized = true;
    }

    @Override
    public void shutdown() {
        if (isShutdown) {
            return;
        }
        try {
            ds.setShutdownDatabase("shutdown");
            // necessary to actually shut down the derby database
            ds.getConnection();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("08006")) {
                // ignore, this is the SQLState derby throws when shutting down the database
                System.out.println("Derby database shut down.");
                isShutdown = true;
            } else {
                logger.error(ex.getMessage());
            }
        }
    }
*/
}
