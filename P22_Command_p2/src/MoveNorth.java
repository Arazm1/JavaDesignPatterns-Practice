package P22_Command_p2.src;

public class MoveNorth implements Command{
    private Rover rover;

    public MoveNorth(Rover rover){
        this.rover = rover;
    }

    @Override
    public void execute(){
        rover.moveUp();
    }

    @Override
    public void undo(){
        rover.moveDown();
    }
    
}
