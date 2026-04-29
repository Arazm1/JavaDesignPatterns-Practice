public class MoveCursorDownCommand implements Command{

    private final GridModel model;

    public MoveCursorDownCommand(GridModel model){
        this.model = model;
    }

    @Override
    public void execute(){
        int newRow = (model.getCursorRow() + 1) % GridModel.GRID_SIZE;

        model.setCursorRow(newRow);
    }
    
}
