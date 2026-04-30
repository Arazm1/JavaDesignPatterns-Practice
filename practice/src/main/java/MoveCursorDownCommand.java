public class MoveCursorDownCommand implements Command{
    
    private CursorSystem cursor;

    public MoveCursorDownCommand(CursorSystem cursor){
        this.cursor = cursor;
    }

    @Override
    public void execute(){
        cursor.cursorDown();
    }   
    
}