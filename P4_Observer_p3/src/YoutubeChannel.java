package P4_Observer_p3.src;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private String videoTitle;

    private final List<Observer> channelObservers;

    public YoutubeChannel(String videoTitle){
        this.videoTitle = videoTitle;
        channelObservers = new ArrayList<>();
    }

    public void registerObserver(Observer observer){
        this.channelObservers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.channelObservers.remove(observer);
    }

    public void notifyObservers(){
        this.channelObservers.forEach(observer -> observer.update(this.videoTitle));
    }

    public void uploadVideo(String videoTitle){
        this.videoTitle = videoTitle;
        notifyObservers();
    }

    public String getVideoTitle(){
        return this.videoTitle;
    }
    
}
