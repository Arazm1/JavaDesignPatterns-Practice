package P16_Bridge.src;

public class Main {
    public static void main(String[] args){
        MessageImp imp = new EmailImp();
        Message message = new PersonalMessage(imp);
        message.send("Special offer for you! All items -20% only today.");

        System.out.println();

        imp = new SMSImp();
        message = new BusinessMessage(imp);
        message.send("Stock value increases by 21% this quarter.");
    }
    
}
