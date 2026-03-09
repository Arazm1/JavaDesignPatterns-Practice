package P5_Singleton_p4.src;

import java.io.BufferedWriter;

public class Logger {
    private static Logger instance;

    private Logger(){

    }

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public synchronized void log(String message){
        System.out.println("Log: " + message);
    }

    
}
