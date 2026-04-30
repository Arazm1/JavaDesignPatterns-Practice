public class CursorSystem {
    private GridModel model;
    private StatusWindow statusWindow;

    public CursorSystem(GridModel model, StatusWindow statusWindow){
        this.model = model;
        this.statusWindow = statusWindow;
    }

    public void cursorUp(){
        System.out.println("Moving Cursor UP");
        model.setCursorRow((model.getCursorRow() - 1 + GridModel.SIZE) % GridModel.SIZE);
        statusWindow.updateGrid(model);
    }

    public void cursorDown(){
        System.out.println("Moving Cursor DOWN");
        model.setCursorRow((model.getCursorRow() + 1) % GridModel.SIZE);
        statusWindow.updateGrid(model);
    }

    public void cursorRight(){
        System.out.println("Moving Cursor RIGHT");
        model.setCursorCol((model.getCursorCol() + 1) % GridModel.SIZE);
        statusWindow.updateGrid(model);
    }

    public void cursorLeft(){
        System.out.println("Moving Cursor LEFT");
        model.setCursorCol((model.getCursorCol() - 1 + GridModel.SIZE) % GridModel.SIZE);
        statusWindow.updateGrid(model);
    }

    public void togglePixel() {
        model.togglePixel(model.getCursorRow(), model.getCursorCol());
        statusWindow.updateGrid(model);
    }

    public void generateCode() {
        //build and print the Java array
        StringBuilder sb = new StringBuilder("int[][] pixelArt = {\n");
        for (int r = 0; r < GridModel.SIZE; r++) {
            sb.append("    {");
            for (int c = 0; c < GridModel.SIZE; c++) {
                sb.append(model.isPixelOn(r, c) ? 1 : 0);
                if (c < GridModel.SIZE - 1) sb.append(", ");
            }
            sb.append(r < GridModel.SIZE - 1 ? "},\n" : "}\n");
        }
        sb.append("};");
        System.out.println(sb);
        statusWindow.updateCode(sb.toString());
    }
}
