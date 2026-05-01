import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StatusWindow {
    private Canvas canvas;
    private TextArea codeArea;


    public StatusWindow(){
        Stage stage = new Stage();
        canvas = new Canvas(8 * 60, 8 * 60);
        codeArea = new TextArea();
        codeArea.setEditable(false);

        VBox layout = new VBox(10, canvas, codeArea);
        Scene scene = new Scene(layout, 490, 600);
        stage.setScene(scene);
        stage.setTitle("Status Window");
        stage.show();
        updateGrid(new GridModel());
        stage.requestFocus();
    }


    public void updateGrid(GridModel model) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int cell = 60;
        for (int r = 0; r < GridModel.SIZE; r++) {
            for (int c = 0; c < GridModel.SIZE; c++) {
                //draw pixel
                gc.setFill(model.isPixelOn(r, c) ? Color.BLACK : Color.WHITE);
                gc.fillRect(c * cell, r * cell, cell, cell);
                // draw cursor
                if (model.getCursorRow() == r && model.getCursorCol() == c) {
                    gc.setFill(Color.RED);
                    gc.fillRect(c * cell + 20, r * cell + 20, 20, 20);
                }
                //draw grid lines
                gc.setStroke(Color.GRAY);
                gc.strokeRect(c * cell, r * cell, cell, cell);
            }
        }
    }

    public void updateCode(String code){
        codeArea.setText(code);
    }


}


