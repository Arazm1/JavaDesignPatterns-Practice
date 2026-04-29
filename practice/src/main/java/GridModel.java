public class GridModel {
    public static final int GRID_SIZE = 8;

    private final boolean[][] pixels = new boolean[GRID_SIZE][GRID_SIZE];
    private int cursorRow = 0;
    private int cursorCol = 0;

    public int getCursorRow(){
        return this.cursorRow;
    }

    public int getCursorCol(){
        return this.cursorCol;
    }

    public void setCursorRow(int row){
        if(row >= 0 && row < GRID_SIZE){
            this.cursorRow = row;
        }
    }

    public void setCursorCol(int col){
        if(col >= 0 && col < GRID_SIZE){
            this.cursorCol = col;
        }
    }

        public boolean isPixelOn(int row, int col) {
            return pixels[row][col];
        }


    public void togglePixel(int row, int col){
        pixels[row][col] = !pixels[row][col];
    }

    public String generateJavaCode(){
        StringBuilder sb = new StringBuilder();
        sb.append("int[][] pixelArt = {\n");

        for(int row = 0; row < GRID_SIZE; row++){
            sb.append("     {");
            for(int col = 0; col < GRID_SIZE; col++){
                sb.append(pixels[row][col] ? 1 : 0);
                if(col < GRID_SIZE - 1){
                    sb.append(", ");
                }
            }
            sb.append("}");
            if(row < GRID_SIZE - 1){
                sb.append(",");
            }
            sb.append("\n");
        }

        sb.append("};");
        return sb.toString();
    }
    
}
