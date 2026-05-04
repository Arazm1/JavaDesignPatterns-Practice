package P22_Command.src;

//Concrete Commands
public class TurnOnLight implements Command{
    private Light light;

    public TurnOnLight(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.turnOn();
    }

    @Override
    public void undo(){
        light.turnOff();
    }
    
}
