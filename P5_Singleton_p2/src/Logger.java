package P5_Singleton_p2.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private BufferedWriter bw;
    private String filename;


    private Logger(){
        setFilename("P5_Singleton_p2/textfiles/filename.txt");

    }

    public static synchronized Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    public synchronized void setFilename(String newFilename){
        try{
            close();
            this.filename = newFilename;
            bw = new BufferedWriter(new FileWriter("P5_Singleton_p2/textfiles/"+ filename, true));
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
        catch(Error e){
            e.printStackTrace();
        }        
    }

    public void write(String message){
        try{
            if(bw != null){
                bw.write(message);
                bw.newLine();
                bw.flush();
                System.out.println("Successfull!");
            }   
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
        catch(Error e){
            System.out.println("Error " + e);
        }
    }

    public synchronized void close(){
        try{
            if(bw != null){
                bw.close();
                bw = null;
            }
        }
        catch(IOException e){
            System.out.println("Error closing file: " + e);
        }
        catch(Error e){
            e.printStackTrace();
        }

    }







    public String getFilename(){
        return this.filename;
    }
    
}
