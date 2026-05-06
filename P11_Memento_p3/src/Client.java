package P11_Memento_p3.src;

public class Client {
    public static void main(String[] args) {
        
        Originator editor = new Originator();
        Caretaker caretaker = new Caretaker();

        editor.write("First version");
        caretaker.save(editor.save());

        
        editor.write("Second version");
        System.out.println(editor.getText());

        
        editor.restore(caretaker.undo());

        System.out.println(editor.getText());

    }
    
}
