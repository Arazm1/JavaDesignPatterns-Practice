package P11_Memento.src;

public class Main {
    public static void main(String[] args) {
        
        Editor editor = new Editor();

        Command command = new Command(editor);

        editor.setText("Hello");
        editor.setCursor(1, 2);
        editor.setSelectionWidth(5);

        command.makeBackup();
        System.out.println(editor);


        editor.setText("Goodbye");
        System.out.println(editor);

        command.undo();

        System.out.println(editor);



    }
    
}
