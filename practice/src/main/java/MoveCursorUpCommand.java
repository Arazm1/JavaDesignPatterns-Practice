public class MoveCursorUpCommand implements Command{

    private final GridModel model;

    public MoveCursorUpCommand(GridModel model){
        this.model = model;
    }


    @Override
    public void execute(){
        int newRow = (model.getCursorRow() -1 + GridModel.GRID_SIZE) % GridModel.GRID_SIZE;

        model.setCursorRow(newRow);
    }   
}