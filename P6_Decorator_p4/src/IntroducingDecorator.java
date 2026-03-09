package P6_Decorator_p4.src;

public class IntroducingDecorator extends MessageDecorator {

    public IntroducingDecorator(Message message){
        super(message);
    }

    @Override
    public void send(String text){
        System.out.println("Dear employee, ");
        super.send(text);
    }
    
}
