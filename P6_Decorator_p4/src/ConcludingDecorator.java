package P6_Decorator_p4.src;

public class ConcludingDecorator extends MessageDecorator{

    public ConcludingDecorator(Message message){
        super(message);
    }

    @Override
    public void send(String text){
        super.send(text);
        System.out.println("Best regards, ");
        System.out.println("Manager X");
    }
    
}
