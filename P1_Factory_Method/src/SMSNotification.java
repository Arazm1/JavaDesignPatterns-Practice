package P1_Factory_Method.src;

public class SMSNotification implements Notification{

    public void send(String message){
        System.out.println("SMS sent. Message: " + message);
    }
    
}
