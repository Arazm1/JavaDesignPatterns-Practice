package P16_Bridge_p2.src;

public class Main {
    public static void main(String[] args) {
        Device device = new Tv();
        RemoteController remoteController = new SmartRemote(device);

        remoteController.togglePower();
        remoteController.volumeUp();
        remoteController.channelUp();
    }
    
}
