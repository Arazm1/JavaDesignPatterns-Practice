package P3_Composite_p4.src;

import java.util.*;

// Component
interface Graphic {
    void draw();
    // Lisää tarvittavat metodit add(), remove(), getChild() jos haluat
}

// Leaf
class Line implements Graphic {
    private String name;

    public Line(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        // Tulosta esim. "Drawing Line <name>"
        System.out.println("Drawing Line " + this.name);
    }
}

// Leaf
class Rectangle implements Graphic {
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        // Tulosta esim. "Drawing Rectangle <name>"
        System.out.println("Drawing Rectangle " + this.name);
    }
}

// Composite
class CompositeGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    @Override
    public void draw() {
        // Kutsu draw() kaikille lapsille rekursiivisesti
        for(Graphic c : children){
            c.draw();
        }
    }

    public void add(Graphic g) {
        // Lisää lapsi
        children.add(g);
    }

    public void remove(Graphic g) {
        // Poista lapsi
        children.remove(g);
    }

    public Graphic getChild(int index) {
        // Palauta lapsi indeksillä
        return children.get(index); // placeholder
    }
}

// Pääohjelma
public class CompositeP4 {
    public static void main(String[] args) {
        Line line1 = new Line("Line1");
        Rectangle rect1 = new Rectangle("Rect1");

        CompositeGraphic picture = new CompositeGraphic();
        picture.add(line1);
        picture.add(rect1);

        CompositeGraphic subPicture = new CompositeGraphic();
        subPicture.add(new Line("Line2"));
        subPicture.add(new Rectangle("Rect2"));

        picture.add(subPicture);

        picture.draw();
    }
}