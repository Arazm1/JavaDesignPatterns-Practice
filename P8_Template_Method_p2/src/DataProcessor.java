package P8_Template_Method_p2.src;

public abstract class DataProcessor {

    public final void handleFile(){
        openFile();
        processData();
        closeFile();
    }

    protected void openFile(){
        System.out.println("Opening the file...");
    }

    protected abstract void processData();

    protected void closeFile(){
        System.out.println("Closing the file..");
    }
    
}
