package LowLevelDesign.DesignPatterns.Singleton.Assignment1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager{
    private static FileBasedConfigurationManagerImpl fileBasedConfigurationManagerInstance = null;
    private static Lock lock = new ReentrantLock();

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        return this.properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        // throw new Unsupport/edOperationException("Unimplemented method 'getConfiguration'");
        return fileBasedConfigurationManagerInstance.convert(this.properties.getProperty(key),type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        this.properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        properties.setProperty(key,value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
        this.properties.remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'clear'");
        this.properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(fileBasedConfigurationManagerInstance==null){
            lock.lock();
            if(fileBasedConfigurationManagerInstance==null){
                fileBasedConfigurationManagerInstance = new FileBasedConfigurationManagerImpl();
            }
            lock.unlock();
        }
        return fileBasedConfigurationManagerInstance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        fileBasedConfigurationManagerInstance = null;
    }
}
