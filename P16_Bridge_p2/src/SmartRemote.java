package P16_Bridge_p2.src;

public class SmartRemote extends RemoteController{
    public SmartRemote(Device device){
        super(device);
    }


    public void smartCommand(String command){
        if(command.toLowerCase().equals("turn on") || command.toLowerCase().equals("turn off")){
            togglePower();
        }
        if(command.toLowerCase().equals("volume up")){
            volumeUp();
        }
        if(command.toLowerCase().equals("volume down")){
            volumeDown();
        }
        if(command.toLowerCase().equals("channel up")){
            channelUp();
        }
        if(command.toLowerCase().equals("channel down")){
            channelDown();
        }
        else{
            System.out.println("Unknown command! Try again");
        }
    }
    
}
