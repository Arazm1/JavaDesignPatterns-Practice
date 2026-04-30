public class GenerateCodeCommand implements Command{

    private CursorSystem cursor;

    public GenerateCodeCommand(CursorSystem cursor){
        this.cursor = cursor;
    }

    @Override
    public void execute(){
        cursor.generateCode();
    }
    
}
