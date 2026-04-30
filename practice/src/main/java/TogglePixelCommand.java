public class TogglePixelCommand implements Command {
    private CursorSystem cursor;

    public TogglePixelCommand(CursorSystem cursor){
        this.cursor = cursor;
    }

    @Override
    public void execute(){
        cursor.togglePixel();
    }
    
}
