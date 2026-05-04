package P22_Command_p2.src;

public class Main {
    public static void main(String[] args) {
        
        Rover myRover = new Rover();
        MissionControl control = new MissionControl();

        Command goNorth = new MoveNorth(myRover);
        Command goEast = new MoveEast(myRover);

        System.out.println("Executing Mission");

        control.executeCommand(goNorth); //(0, 1)
        control.executeCommand(goNorth); //(0, 2)
        control.executeCommand(goEast); //(1, 2)
        control.executeCommand(goEast); //(2, 2)


        System.out.println("Danger");
        control.undoLastCommand(); // Undoes the 2nd goEast -> back to (1, 2)
        control.undoLastCommand(); // Undoes the 1st goEast -> back to (0, 2)
        control.undoLastCommand(); // Undoes the 2nd goNorth -> back to (0, 1)
        control.undoLastCommand(); // Undoes the 1st goNorth -> back to (0, 0)

        control.undoLastCommand();

    }
    
}
