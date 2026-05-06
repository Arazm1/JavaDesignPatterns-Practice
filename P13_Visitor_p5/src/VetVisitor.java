package P13_Visitor_p5.src;

public class VetVisitor implements Visitor {

    @Override
    public void visit(Dog dog) {
        System.out.println("Checking dog: " + dog.getName() + "...");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Checking cat: " + cat.getName() + "...");
    }
    
}
