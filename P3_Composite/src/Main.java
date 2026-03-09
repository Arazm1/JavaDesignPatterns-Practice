package P3_Composite.src;

public class Main {
    public static void main(String[] args) {

        Component box1 = new Box("Large box");

        Component item1 = new Item("Laptop");
        Component item2 = new Item("Phone");
        Component item3 = new Item("Charger");

        box1.add(item1);
        box1.add(item2);
        box1.add(item3);

        box1.printData();
    }
}
