public class MoveCursorLeftCommand implements Command {

    private final GridModel model;

    public MoveCursorLeftCommand(GridModel model){
        this.model = model;
    }

    @Override
    public void execute(){
        int newCol = (model.getCursorCol() - 1 + GridModel.GRID_SIZE) % GridModel.GRID_SIZE;

        model.setCursorCol(newCol);
    }
    
}
