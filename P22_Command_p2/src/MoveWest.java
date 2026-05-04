package P22_Command_p2.src;

public class MoveWest implements Command{

    private Rover rover;

    public MoveWest(Rover rover){
        this.rover = rover;
    }

    @Override
    public void execute(){
        rover.moveLeft();
    }

    @Override
    public void undo(){
        rover.moveRight();
    }
    
}
