package P4_Observer_p3.src;

public class Main {
    public static void main(String[] args){

        YoutubeChannel youtubeChannel = new YoutubeChannel("");
        //System.out.println(youtubeChannel.getVideoTitle());

        ChannelSubscriber subscriber1 = new ChannelSubscriber("Name1");
        ChannelSubscriber subscriber2 = new ChannelSubscriber("Name2");

        youtubeChannel.registerObserver(subscriber1);
        youtubeChannel.registerObserver(subscriber2);

        youtubeChannel.uploadVideo("NoWay");
        
    }
    
}
