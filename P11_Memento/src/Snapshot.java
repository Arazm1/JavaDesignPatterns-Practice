package P11_Memento.src;

public class Snapshot {
    private Editor editor;
    private String text;
    private int curlX;
    private int curlY;
    private int selectionWidth;

    public Snapshot(Editor editor, String text, int curlX, int curlY, int selectionWidth){
        this.editor = editor;
        this.text = text;
        this.curlX = curlX;
        this.curlY = curlY;
        this.selectionWidth = selectionWidth;
    }

    public void restore(){
        editor.setText(text);
        editor.setCursor(curlX, curlY);
        editor.setSelectionWidth(selectionWidth);

    }
    
}
