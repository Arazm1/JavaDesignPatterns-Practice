package P1_Factory_Method.src;

public class EmailNotification implements Notification{
    
    public void send(String message){
        System.out.println("Email sent. Message: " + message);
    }
    
}
