package P8_Template_Method_p2.src;

public class Main {
    public static void main(String[] args){
        System.out.println("JSON");
        DataProcessor json = new JsonProcessor();
        json.handleFile();


        System.out.println("CSV");
        DataProcessor csv = new CSVProcessor();
        csv.handleFile();
    }
    
}
