package P1_Factory_Method.src;

public class Main {
    public static void main(String[] args){

        NotificationCreator creator = new EmailNotificationCreator();

        Notification notification = creator.createNotification();

        notification.send("Hello user!");
    }
    
}
