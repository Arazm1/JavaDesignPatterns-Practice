package P6_Decorator_p4.src;

public class MessageDecorator implements Message{
    private Message message;

    public MessageDecorator(Message message){
        this.message = message;
    }

    @Override
    public void send(String text){
        message.send(text);
    }
    
}
