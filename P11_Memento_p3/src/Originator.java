package P11_Memento_p3.src;

public class Originator {
    private String currentText;


    public void write(String text){
        this.currentText = text;

    }

    public Memento save(){
        return new Memento(this.currentText);
    }

    public void restore(Memento m){
        if(m != null){
            this.currentText = m.getState();
        }
    }

    public String getText(){
        return this.currentText;
    }
    
}
