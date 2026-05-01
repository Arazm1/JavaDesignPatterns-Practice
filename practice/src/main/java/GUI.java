import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StatusWindow statusWindow = new StatusWindow();
        GridModel gridModel = new GridModel();
        CursorSystem cursorSystem = new CursorSystem(gridModel, statusWindow);

        Command moveUp    = new MoveCursorUpCommand(cursorSystem);
        Command moveDown  = new MoveCursorDownCommand(cursorSystem);
        Command moveLeft  = new MoveCursorLeftCommand(cursorSystem);
        Command moveRight = new MoveCursorRightCommand(cursorSystem);
        Command toggle    = new TogglePixelCommand(cursorSystem);
        Command genCode   = new GenerateCodeCommand(cursorSystem);

        Button btnCode = new Button("Create Code");
        btnCode.setOnAction(e -> genCode.execute());

        VBox layout = new VBox(10, btnCode);
        Scene scene = new Scene(layout, 300, 100);

        layout.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP    -> moveUp.execute();
                case DOWN  -> moveDown.execute();
                case LEFT  -> moveLeft.execute();
                case RIGHT -> moveRight.execute();
                case SPACE -> toggle.execute();
            }
        });

        stage.setScene(scene);
        stage.setTitle("Editor Controls");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}