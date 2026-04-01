package P6_Decorator_p5.src;


// Component
interface VisualComponent {
    void draw();
}

// Concrete Component
class TextView implements VisualComponent {
    @Override
    public void draw() {
        // Tulosta: "Drawing TextView"
        System.out.println("Drawing TextView");
    }
}

// Decorator
abstract class Decorator implements VisualComponent {
    protected VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public void draw() {
        // Forwardoi kutsu komponentille
        component.draw();
    }
}

// Concrete Decorator
class BorderDecorator extends Decorator {

    public BorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        // Lisää border ennen tai jälkeen draw()-kutsun
        // Tulosta: "Adding border"
        System.out.println("Adding border");
        super.draw();
    }
}

// Concrete Decorator
class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        // Lisää scroll ennen tai jälkeen draw()-kutsun
        // Tulosta: "Adding scroll"
        System.out.println("Adding scroll");
        super.draw();
    }
}

// Client
public class DecoratorP5 {
    public static void main(String[] args) {

        VisualComponent text = new TextView();

        VisualComponent bordered =
                new BorderDecorator(text);

        VisualComponent scrolledAndBordered =
                new ScrollDecorator(bordered);

        scrolledAndBordered.draw();
    }
}
