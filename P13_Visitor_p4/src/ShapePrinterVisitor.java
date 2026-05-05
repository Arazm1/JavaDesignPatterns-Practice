package P13_Visitor_p4.src;

//Concrete Visitor
public class ShapePrinterVisitor implements Visitor {

    @Override
    public void visit(Rectangle rectangle){
        System.out.println("Rectangle information: ");
        System.out.println("Position (x, y): (" + rectangle.getX() + ", " + rectangle.getY() + ")");
        System.out.println("Dimensions: " + rectangle.getWidth() + "x" + rectangle.getHeight());

        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area: " + area);
        System.out.println();
    }


    @Override
    public void visit(Circle circle){
        System.out.println("Circle information: ");
        System.out.println("Position (x, y): (" + circle.getX() + ", " + circle.getY() + ")");
        System.out.println("Radius: " + circle.getRadius());

        double area = Math.PI * Math.pow(circle.getRadius(), 2);

        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println();
    }
    
}
