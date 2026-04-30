public class MoveCursorLeftCommand implements Command {

    private CursorSystem cursor;

    public MoveCursorLeftCommand(CursorSystem cursor){
        this.cursor = cursor;
    }


    @Override
    public void execute(){
        cursor.cursorLeft();
    }
    
}