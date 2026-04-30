public class MoveCursorRightCommand implements Command{

    private CursorSystem cursor;

    public MoveCursorRightCommand(CursorSystem cursor){
        this.cursor = cursor;
    }

    @Override
    public void execute(){
        cursor.cursorRight();
    }
    
}