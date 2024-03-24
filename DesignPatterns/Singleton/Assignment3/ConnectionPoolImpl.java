package LowLevelDesign.DesignPatterns.Singleton.Assignment3;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPool connectionPoolInstance = null;
    private static Lock lock = new ReentrantLock();
    private int totalConnections;
    private int availableConnections;
    private HashMap<DatabaseConnection,Boolean> connectionsMap ;
    
    private ConnectionPoolImpl(int maxConnections){
        super();
        this.totalConnections = maxConnections;
        initializePool();
    }

    public static ConnectionPool getInstance(int maxConnections){
        if(connectionPoolInstance==null){
            lock.lock();
            if(connectionPoolInstance==null){
                connectionPoolInstance = new ConnectionPoolImpl(maxConnections);
            }
            lock.unlock();
        }
        return connectionPoolInstance;
    }

    public static void resetInstance(){
        connectionPoolInstance = null;
    }

    @Override
    public void initializePool() {
        connectionsMap = new HashMap<>();
        for(int i=0;i<totalConnections;i++){
            connectionsMap.put(new DatabaseConnection(),true);
        }
        availableConnections = totalConnections;
    }

    @Override
    public DatabaseConnection getConnection() {
        if(availableConnections>0){
            for(DatabaseConnection dbConn:connectionsMap.keySet()){
                if(connectionsMap.get(dbConn)){
                    connectionsMap.put(dbConn,false);
                    availableConnections-=1;
                    return dbConn;
                }
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connectionsMap.put(connection,true);
        availableConnections+=1;
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections;
    }

    @Override
    public int getTotalConnectionsCount() {
        return totalConnections;
    }
}