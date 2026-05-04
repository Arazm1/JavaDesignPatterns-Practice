package P22_Command.src;

public class RemoteControl {

    private Command currentCommand;
    private Command lastExecutedCommand;

    public void setCommand(Command command){
        this.currentCommand = command;
    }

    //Execute the loaded command
    public void pressButton(){
        if(currentCommand != null){
            currentCommand.execute();

            //Save it so you can undo it later
            lastExecutedCommand = currentCommand;
        }
    }

    public void pressUndo(){
        if(lastExecutedCommand != null){
            lastExecutedCommand.undo();
        }
        else{
            System.out.println("Nothing to undo!");
        }
    }


    
}
