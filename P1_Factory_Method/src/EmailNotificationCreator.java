package P1_Factory_Method.src;

public class EmailNotificationCreator extends NotificationCreator{

    Notification createNotification(){
        return new EmailNotification();
    }
    
}
