package P1_Factory_Method.src;

public class PushNotification implements Notification{

    public void send(String message){
        System.out.println("Push Notification sent. Message: " + message);
    }
    
}
