public class TogglePixelCommand implements Command {


    private final GridModel model;

    public TogglePixelCommand(GridModel model){
        this.model = model;
    }

    @Override
    public void execute(){
        model.togglePixel(model.getCursorRow(), model.getCursorCol());
    }
    
}
