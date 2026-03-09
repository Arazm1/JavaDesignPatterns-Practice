package P6_Decorator_p3.src;

public class CapitalizedPrinter extends PrinterDecorator{

    public CapitalizedPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String text){
        super.print(text.toUpperCase());
    }


    
}
