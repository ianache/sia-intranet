package ws.crossnet.intranet.database;

/**
 *
 * @author ianache
 */
public interface DatasourceObject {
    public void initialize(String pathtoResource);
    public void shutdown();
}
