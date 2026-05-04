package P22_Command_p2.src;

public class MoveEast implements Command{
    private Rover rover;

    public MoveEast(Rover rover){
        this.rover = rover;
    }

    @Override
    public void execute(){
        rover.moveRight();
    }

    @Override
    public void undo(){
        rover.moveLeft();
    }
    
}
