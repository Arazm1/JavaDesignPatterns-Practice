package P22_Command.src;

//Concrete Commands
public class TurnOffLight implements Command{
    private Light light;

    public TurnOffLight(Light light){
        this.light = light;
    }


    @Override
    public void execute(){
        light.turnOff();
    }

    @Override
    public void undo(){
        light.turnOn();
    }
    
}
