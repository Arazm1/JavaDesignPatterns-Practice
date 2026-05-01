package P12_Proxy_p2.src;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    public void listVideos(){
        System.out.println("Listing videos..");
    }

    @Override
    public void getVideoInfo() {
        System.out.println("Getting video info..");
    }

    @Override
    public void downloadVideo() {
        System.out.println("Downloading a video file from Youtube..");
    }
    
}
