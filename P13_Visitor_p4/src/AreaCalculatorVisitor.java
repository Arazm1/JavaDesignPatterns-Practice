package P13_Visitor_p4.src;

//Concrete Visitor
public class AreaCalculatorVisitor implements Visitor{

    @Override
    public void visit(Rectangle rectangle){
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);
    }

    @Override
    public void visit(Circle circle){
        int area = (int) (Math.PI * circle.getRadius() * circle.getRadius());
        System.out.println("Cricle area: " + area);
    }
    
}
