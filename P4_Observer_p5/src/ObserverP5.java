package P4_Observer_p5.src;

// Subject
import java.util.*;

class Subject {
    // Lista havainnoijista
    // Toteuta tarvittavat metodit rekisteröintiä ja ilmoituksia varten
    private final List<ConcreteObserver> observers;

    public Subject(){
        this.observers = new ArrayList<>();
    }

    public void addObservers(ConcreteObserver observer){
        this.observers.add(observer);
    }

    public void removeObservers(ConcreteObserver observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(String message){
        this.observers.forEach(observer -> observer.update(message));
    }
}

// Concrete Subject
class ConcreteSubject extends Subject {
    private String state;

    public void setState(String newState) {
        // Päivitä tila ja ilmoita havainnoijat
        this.state = newState;
        notifyObserver(state);
    }

    public String getState() {
        return state;
    }
}

// Observer
interface Observer {
    void update(String state);
}

// Concrete Observer
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        // Rekisteröidy subjectiin
        subject.addObservers(this);
    }

    @Override
    public void update(String state) {
        // Tulosta esimerkiksi: "Observer X: Subject changed to <state>"
        System.out.println(this.name + ": Subject changed to " + state);
    }
}

// Pääohjelma
public class ObserverP5 {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver obs1 = new ConcreteObserver("A", subject);
        ConcreteObserver obs2 = new ConcreteObserver("B", subject);

        subject.setState("ON");
        subject.setState("OFF");
    }
}