public class MoveCursorUpCommand implements Command{

    private CursorSystem cursor;

    public MoveCursorUpCommand(CursorSystem cursor){
        this.cursor = cursor;
    }

    @Override
    public void execute(){
        cursor.cursorUp();
    }
    
}