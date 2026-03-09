package P4_Observer_p3.src;

public class ChannelSubscriber implements Observer{
    private final String observer;

    public ChannelSubscriber(String observer){
        this.observer = observer;
    }

    @Override
    public void update(String videoTitle){
        System.out.println(this.observer + " received a notification: New Video Uploaded: " + videoTitle + "!");
    }
    
    


}
