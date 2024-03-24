package LowLevelDesign.DesignPatterns.Singleton.Assignment2;

import java.lang.System.Logger.Level;

public interface Logger {

    void log(Level level, String message);

    void setLogFile(String filePath);

    String getLogFile();

    // Flush the log entries to the file
    void flush();

    // Close the logger and release any resources
    void close();
}
