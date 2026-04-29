import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class PixelArtEditor extends Application {
 
    // ── Layout constants ─────────────────────────────────────────────────────
    private static final int CELL_SIZE    = 60;   // pixels per grid cell
    private static final int GRID_CELLS   = GridModel.GRID_SIZE;
    private static final int CANVAS_SIZE  = CELL_SIZE * GRID_CELLS;
    private static final int BORDER_WIDTH = 2;
 
    // ── Colours (retro green-phosphor CRT palette) ───────────────────────────
    private static final Color BG_COLOR      = Color.web("#0d0d0d");
    private static final Color GRID_COLOR    = Color.web("#1a3a1a");
    private static final Color PIXEL_ON      = Color.web("#39ff14");   // neon green
    private static final Color PIXEL_GLOW    = Color.web("#39ff1466"); // transparent glow
    private static final Color CURSOR_COLOR  = Color.web("#ffdd00");   // amber cursor
    private static final Color CURSOR_INNER  = Color.web("#ffdd0033");
    private static final Color TEXT_COLOR    = Color.web("#39ff14");
    private static final Color PANEL_BG      = Color.web("#111811");
 
    // ── State ────────────────────────────────────────────────────────────────
    private final GridModel model = new GridModel();
    private Canvas  canvas;
    private TextArea codeArea;
 
    // ── Commands ─────────────────────────────────────────────────────────────
    private Command moveUp, moveDown, moveLeft, moveRight;
    private Command togglePixel;
    private Command generateCode;
 
    // ─────────────────────────────────────────────────────────────────────────
 
    @Override
    public void start(Stage stage) {
        // Instantiate commands (Command pattern)
        moveUp      = new MoveCursorUpCommand(model);
        moveDown    = new MoveCursorDownCommand(model);
        moveLeft    = new MoveCursorLeftCommand(model);
        moveRight   = new MoveCursorRightCommand(model);
        togglePixel = new TogglePixelCommand(model);
        generateCode = new GenerateCodeCommand(model);
 
        // ── Canvas ────────────────────────────────────────────────────────
        canvas = new Canvas(CANVAS_SIZE, CANVAS_SIZE);
        drawGrid();
 
        StackPane canvasPane = new StackPane(canvas);
        canvasPane.setStyle("-fx-background-color: #0d0d0d; -fx-border-color: #39ff14; "
                + "-fx-border-width: 2; -fx-effect: dropshadow(gaussian, #39ff1488, 20, 0.5, 0, 0);");
 
        // ── Instruction label ─────────────────────────────────────────────
        Label instructions = new Label(
                "ARROW KEYS → move cursor    SPACE → toggle pixel    CLICK → Create Code");
        instructions.setFont(Font.font("Monospace", 12));
        instructions.setTextFill(Color.web("#39ff1499"));
 
        // ── Create Code button ────────────────────────────────────────────
        Button createCodeBtn = new Button("▶  CREATE CODE");
        createCodeBtn.setFont(Font.font("Monospace", 14));
        createCodeBtn.setStyle(
                "-fx-background-color: #39ff14; "
              + "-fx-text-fill: #0d0d0d; "
              + "-fx-font-weight: bold; "
              + "-fx-padding: 10 24; "
              + "-fx-cursor: hand; "
              + "-fx-border-radius: 0; -fx-background-radius: 0;");
        createCodeBtn.setOnMouseEntered(e -> createCodeBtn.setStyle(
                "-fx-background-color: #ffdd00; "
              + "-fx-text-fill: #0d0d0d; "
              + "-fx-font-weight: bold; "
              + "-fx-padding: 10 24; "
              + "-fx-cursor: hand; "
              + "-fx-border-radius: 0; -fx-background-radius: 0;"));
        createCodeBtn.setOnMouseExited(e -> createCodeBtn.setStyle(
                "-fx-background-color: #39ff14; "
              + "-fx-text-fill: #0d0d0d; "
              + "-fx-font-weight: bold; "
              + "-fx-padding: 10 24; "
              + "-fx-cursor: hand; "
              + "-fx-border-radius: 0; -fx-background-radius: 0;"));
 
        createCodeBtn.setOnAction(e -> {
            generateCode.execute();           // Command pattern call
            codeArea.setText(model.generateJavaCode());
        });
 
        // ── Code output area ──────────────────────────────────────────────
        Label codeLabel = new Label("// GENERATED JAVA CODE");
        codeLabel.setFont(Font.font("Monospace", 11));
        codeLabel.setTextFill(Color.web("#39ff1466"));
 
        codeArea = new TextArea();
        codeArea.setFont(Font.font("Monospace", 12));
        codeArea.setEditable(false);
        codeArea.setPrefHeight(220);
        codeArea.setPromptText("Click \"Create Code\" to generate Java array...");
        codeArea.setStyle(
                "-fx-control-inner-background: #0d1a0d; "
              + "-fx-text-fill: #39ff14; "
              + "-fx-border-color: #39ff1444; "
              + "-fx-border-width: 1; "
              + "-fx-background-radius: 0; -fx-border-radius: 0;");
 
        // ── Right panel ───────────────────────────────────────────────────
        VBox rightPanel = new VBox(16,
                buildLegend(),
                createCodeBtn,
                codeLabel,
                codeArea);
        rightPanel.setPadding(new Insets(10));
        rightPanel.setPrefWidth(320);
        rightPanel.setAlignment(Pos.TOP_LEFT);
        rightPanel.setStyle("-fx-background-color: #111811;");
 
        // ── Root layout ───────────────────────────────────────────────────
        VBox leftSide = new VBox(12, canvasPane, instructions);
        leftSide.setAlignment(Pos.TOP_CENTER);
        leftSide.setPadding(new Insets(20));
 
        HBox root = new HBox(0, leftSide, rightPanel);
        root.setStyle("-fx-background-color: #0d0d0d;");
 
        // ── Scene & keyboard handling ─────────────────────────────────────
        Scene scene = new Scene(root);
        scene.setFill(BG_COLOR);
 
        scene.setOnKeyPressed(e -> {
            KeyCode key = e.getCode();
            if      (key == KeyCode.UP)    { moveUp.execute();     }
            else if (key == KeyCode.DOWN)  { moveDown.execute();   }
            else if (key == KeyCode.LEFT)  { moveLeft.execute();   }
            else if (key == KeyCode.RIGHT) { moveRight.execute();  }
            else if (key == KeyCode.SPACE) {
                togglePixel.execute();
                e.consume(); // prevent scroll
            }
            drawGrid();
        });
 
        stage.setTitle("PIXEL ART EDITOR  //  8×8");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
 
        // Grab keyboard focus
        canvas.setFocusTraversable(true);
        canvas.requestFocus();
    }
 
    // ── Drawing ───────────────────────────────────────────────────────────────
 
    /** Redraws the entire canvas based on current model state. */
    private void drawGrid() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
 
        // Background
        gc.setFill(BG_COLOR);
        gc.fillRect(0, 0, CANVAS_SIZE, CANVAS_SIZE);
 
        for (int row = 0; row < GRID_CELLS; row++) {
            for (int col = 0; col < GRID_CELLS; col++) {
 
                double x = col * CELL_SIZE;
                double y = row * CELL_SIZE;
 
                boolean isOn     = model.isPixelOn(row, col);
                boolean isCursor = (row == model.getCursorRow() && col == model.getCursorCol());
 
                // ── Cell background ───────────────────────────────────────
                if (isOn) {
                    // Glow layer
                    gc.setFill(PIXEL_GLOW);
                    gc.fillRect(x + 1, y + 1, CELL_SIZE - 2, CELL_SIZE - 2);
                    // Solid pixel
                    gc.setFill(PIXEL_ON);
                    gc.fillRect(x + 6, y + 6, CELL_SIZE - 12, CELL_SIZE - 12);
                }
 
                // ── Cursor overlay ────────────────────────────────────────
                if (isCursor) {
                    // Inner fill
                    gc.setFill(CURSOR_INNER);
                    gc.fillRect(x + 1, y + 1, CELL_SIZE - 2, CELL_SIZE - 2);
                    // Cursor border (corner marks for a retro crosshair feel)
                    gc.setStroke(CURSOR_COLOR);
                    gc.setLineWidth(2.5);
                    int c = 10; // corner size
                    // Top-left corner
                    gc.strokeLine(x + 3, y + 3, x + 3 + c, y + 3);
                    gc.strokeLine(x + 3, y + 3, x + 3, y + 3 + c);
                    // Top-right corner
                    gc.strokeLine(x + CELL_SIZE - 3, y + 3, x + CELL_SIZE - 3 - c, y + 3);
                    gc.strokeLine(x + CELL_SIZE - 3, y + 3, x + CELL_SIZE - 3, y + 3 + c);
                    // Bottom-left corner
                    gc.strokeLine(x + 3, y + CELL_SIZE - 3, x + 3 + c, y + CELL_SIZE - 3);
                    gc.strokeLine(x + 3, y + CELL_SIZE - 3, x + 3, y + CELL_SIZE - 3 - c);
                    // Bottom-right corner
                    gc.strokeLine(x + CELL_SIZE - 3, y + CELL_SIZE - 3, x + CELL_SIZE - 3 - c, y + CELL_SIZE - 3);
                    gc.strokeLine(x + CELL_SIZE - 3, y + CELL_SIZE - 3, x + CELL_SIZE - 3, y + CELL_SIZE - 3 - c);
                }
 
                // ── Grid lines ────────────────────────────────────────────
                gc.setStroke(GRID_COLOR);
                gc.setLineWidth(0.8);
                gc.strokeRect(x, y, CELL_SIZE, CELL_SIZE);
            }
        }
 
        // Coord label
        gc.setFill(Color.web("#39ff1466"));
        gc.setFont(Font.font("Monospace", 11));
        gc.fillText(String.format("ROW %d  COL %d",
                model.getCursorRow(), model.getCursorCol()), 6, CANVAS_SIZE - 6);
    }
 
    /** Builds a small colour-legend panel. */
    private VBox buildLegend() {
        Label title = styledLabel("LEGEND", "#39ff14", 13);
 
        HBox onRow  = legendRow(PIXEL_ON,     "Pixel ON  (SPACE to toggle)");
        HBox offRow = legendRow(GRID_COLOR,   "Pixel OFF");
        HBox curRow = legendRow(CURSOR_COLOR, "Cursor    (Arrow keys)");
 
        VBox box = new VBox(6, title, onRow, offRow, curRow);
        box.setPadding(new Insets(10));
        box.setStyle("-fx-border-color: #39ff1433; -fx-border-width: 1;");
        return box;
    }
 
    private HBox legendRow(Color swatch, String text) {
        javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle(14, 14, swatch);
        Label lbl = styledLabel(text, "#39ff1499", 11);
        HBox row = new HBox(8, rect, lbl);
        row.setAlignment(Pos.CENTER_LEFT);
        return row;
    }
 
    private Label styledLabel(String text, String hex, int size) {
        Label l = new Label(text);
        l.setFont(Font.font("Monospace", size));
        l.setTextFill(Color.web(hex));
        return l;
    }
}
