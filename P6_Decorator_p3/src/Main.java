package P6_Decorator_p3.src;

public class Main {
    public static void main(String[] args){

        Printer printer;

        printer = new BasicPrinter();
        printer.print("Hello world!");

        printer = new CapitalizedPrinter(new BasicPrinter());
        printer.print("Hello world!");
    }
    
}
