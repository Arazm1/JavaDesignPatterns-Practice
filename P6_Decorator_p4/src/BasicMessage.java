package P6_Decorator_p4.src;

public class BasicMessage implements Message{

    @Override
    public void send(String text){
        System.out.println(text);
    }    
}
