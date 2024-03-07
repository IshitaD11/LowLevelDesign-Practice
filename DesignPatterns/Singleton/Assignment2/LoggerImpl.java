package ScalerLLD.DesignPatterns.Singleton.Assignment2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger.Level;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoggerImpl implements Logger{

    private static LoggerImpl LoggerImplInstance = null;
    private static Lock lock = new ReentrantLock();
    private PrintWriter printWriter;
    protected String filePath;

    private LoggerImpl(){
        super();
    }

    public static Logger getInstance(){
        if(LoggerImplInstance==null){
            lock.lock();
            if(LoggerImplInstance==null){
                LoggerImplInstance = new LoggerImpl();
            }
            lock.unlock();
        }
        return LoggerImplInstance;
    }

    public static void resetInstance(){
        LoggerImplInstance = null;
    }

    @Override
    public void log(Level level, String message) {
        if(printWriter==null)
            throw new IllegalStateException("Logger not initialised using the setLogFile() method");
        String str = java.time.LocalDate.now().toString() + level + message;

        printWriter.println(str);
    }

    @Override
    public void setLogFile(String filePath){
       
        this.filePath = filePath;
        try {
            printWriter = new PrintWriter(new FileWriter(filePath));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String getLogFile() {
        return filePath;
    }

    @Override
    public void flush() {
        printWriter.flush();
    }

    @Override
    public void close() {
        printWriter.close();
    }
    
}
