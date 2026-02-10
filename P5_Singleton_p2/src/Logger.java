package P5_Singleton_p2.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String filename;

    private BufferedWriter bw;


    private Logger(String filename){
        this.filename = filename;

    }

    public static synchronized Logger getInstance(){
        if (instance == null) {
            instance = new Logger("P5_Singleton_p2/src/filename.txt");
        }
        return instance;
    }


    public synchronized void setFilename(String newFilename){
        this.filename = newFilename;
    }

    


    

    public void write(String message){
        try{
            bw = new BufferedWriter(new FileWriter(filename, true));
            bw.write(message);
            bw.newLine();
            bw.close();
            System.out.println("Successfull!");
            


        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }

    }







    public String getFilename(){
        return this.filename;
    }
    
}
