package P16_Bridge.src;

public abstract class Message {
    private MessageImp messageImp;

    public Message(MessageImp ms){
        this.messageImp = ms;
    }

    public MessageImp getMessageImp(){
        return this.messageImp;
    }

    public void send(String message){
        messageImp.sendMessage(message);
    }
    
}
