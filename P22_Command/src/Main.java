package P22_Command.src;

public class Main {
    public static void main(String[] args) {
        
        //1. Create the Receiver
        Light livingRoomLight = new Light();

        //2. Create the Commands
        Command turnOn = new TurnOnLight(livingRoomLight);
        Command turnOff = new TurnOffLight(livingRoomLight);

        //3. Create the Invoker
        RemoteControl remote = new RemoteControl();


        System.out.println("Pressing Button");
        remote.setCommand(turnOn);
        remote.pressButton();


        System.out.println();
        System.out.println("Pressing Undo");
        remote.pressUndo();

        System.out.println();
        System.out.println("Pressing Button");
        remote.setCommand(turnOff);
        remote.pressButton();

        System.out.println();
        System.out.println("Pressing Undo");
        remote.pressUndo();
    }
    
}
