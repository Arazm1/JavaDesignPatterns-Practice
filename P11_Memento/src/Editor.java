package P11_Memento.src;

public class Editor {
    private String text;
    private int curlX;
    private int curlY;
    private int selectionWidth;

    public Editor(){}

    public void setText(String text){
        this.text = text;
    }

    public void setCursor(int curlX, int curlY){
        this.curlX = curlX;
        this.curlY = curlY;
    }

    public void setSelectionWidth(int selectionWidth){
        this.selectionWidth = selectionWidth;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this, this.text, this.curlX, this.curlY, this.selectionWidth);
    }

    @Override
    public String toString() {
        return "Text: " + text +
            ", Cursor: (" + curlX + ", " + curlY + ")" +
            ", SelectionWidth: " + selectionWidth;
    }
    
}
