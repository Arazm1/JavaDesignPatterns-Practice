package P8_Template_Method_p2.src;

public class CSVProcessor extends DataProcessor{

    @Override
    public void processData(){
        System.out.println("Processing the CSV file...");
        coolStuffFound();
    }

    @Override
    public void closeFile(){
        System.out.println("Closing the file. Forever.");
    }

    private void coolStuffFound(){
        System.out.println("What is this..");
    }
    
    
}
