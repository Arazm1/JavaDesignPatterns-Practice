package P6_Decorator_p4.src;

public class Main {
    public static void main(String[] args){

        Message message;

        message = new BasicMessage();
        message.send("The reporting system is working fine once again..");

        message = new IntroducingDecorator(new BasicMessage());
        message.send("The reporting system is working fine once again..");

        System.out.println();
        System.out.println("All");
        message = new IntroducingDecorator(new ConcludingDecorator(new BasicMessage()));
        message.send("The reporting system is working fine once again..");
    }
    
}
