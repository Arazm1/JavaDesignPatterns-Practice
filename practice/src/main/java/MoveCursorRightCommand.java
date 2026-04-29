public class MoveCursorRightCommand implements Command{

    private final GridModel model;

    public MoveCursorRightCommand(GridModel model){
        this.model = model;
    }

    @Override
    public void execute(){
        int newCol = (model.getCursorCol() + 1) % GridModel.GRID_SIZE;

        model.setCursorCol(newCol);
    }
    
}
