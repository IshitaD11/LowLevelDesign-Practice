package ScalerLLD.DesignPatterns.Singleton.Assignment3;

public interface ConnectionPool {

    ConnectionPool(){
        
    }

    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();

}