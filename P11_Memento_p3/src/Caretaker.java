package P11_Memento_p3.src;

public class Caretaker {
    private Memento storedMemento;

    public void save(Memento m){
        this.storedMemento = m;
    }

    public Memento undo(){
        return this.storedMemento;
    }
    
}
