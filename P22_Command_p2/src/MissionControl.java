package P22_Command_p2.src;

import java.util.Stack;

public class MissionControl {
    private Stack<Command> commandHistory;

    public MissionControl(){
        this.commandHistory = new Stack<>();
    }


    public void executeCommand(Command command){
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand(){
        if(!commandHistory.isEmpty()){
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
        else{
            System.out.println("Rover is at its starting point. Nothing to undo!");
        }
    }
    
}
