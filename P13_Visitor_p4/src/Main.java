package P13_Visitor_p4.src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 10, 30, 40));
        shapes.add(new Circle(10, 20, 30));

        AreaCalculatorVisitor areaCalculator = new AreaCalculatorVisitor();

        for(Shape shape : shapes){
            shape.accept(areaCalculator);
        }

        ShapePrinterVisitor shapePrinter = new ShapePrinterVisitor();
        for(Shape shape : shapes){
            shape.accept(shapePrinter);
        }

    }
    
}
