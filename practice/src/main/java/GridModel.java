public class GridModel {

    public static final int SIZE = 0;
    private boolean[][] pixels = new boolean[SIZE][SIZE];
    private int cursorRow = 0;
    private int cursorCol = 0;

    public boolean isPixelOn(int row, int col){
        return this.pixels[row][col];
    }

    public void togglePixel(int row, int col){
        pixels[row][col] = !pixels[row][col];
    }

    public int getCursorRow(){
        return this.cursorRow;
    }

    public int getCursorCol(){
        return this.cursorCol;
    }

    public void setCursorRow(int cursorRow){
        this.cursorRow = cursorRow;
    }

    public void setCursorCol(int cursorCol){
        this.cursorCol = cursorCol;
    }
}
