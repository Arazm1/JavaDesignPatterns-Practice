package P22_Command_p2.src;

public class MoveSouth implements Command{
    private Rover rover;

    public MoveSouth(Rover rover){
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveDown();
    }

    @Override
    public void undo() {
        rover.moveUp();
    }
    
}
