package P6_Decorator_p6.src;

public class ConcreateDecorator1 extends Decorator{
    
    public ConcreateDecorator1(Component component){
        super(component);
    }

    @Override
    public void send(String message){
        super.send(message.toLowerCase());
        System.out.println("LowerCased");
    }
    
}
