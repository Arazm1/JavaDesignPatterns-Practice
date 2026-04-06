package P16_Bridge_p2.src;

public abstract class RemoteController {
    private Device device;

    public RemoteController(Device device){
        this.device = device;
    }


    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
            System.out.println("Turned off..");
        }
        else{
            device.enable();
            System.out.println("Turned on..");
        }
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 10);
        System.out.println("Volume decreased to " + device.getVolume());
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 10);
        System.out.println("Volume increased to " + device.getVolume());
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
        System.out.println("Channel changed to " + device.getChannel());
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
        System.out.println("Channel changed to " + device.getChannel());
    }
    
}
