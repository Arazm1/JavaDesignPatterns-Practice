package P22_Command_p4.src;

//Concrete Commands
public class OpenCommand implements Command{
    private Document document;

    public OpenCommand(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
    
}
