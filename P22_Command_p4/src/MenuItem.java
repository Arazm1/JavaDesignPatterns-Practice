package P22_Command_p4.src;

//Invoker
public class MenuItem {
    private Command command;
    private Command lastCommand;

    public MenuItem(Command command){
        this.command = command;
    }

    
    public void clicked(){
        if(command != null){
            command.execute();
        }
    }
    
}
