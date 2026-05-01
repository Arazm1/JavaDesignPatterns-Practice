package P13_Visitor_p2.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 10, 20, 30));
        shapes.add(new Line(0, 0, 15, 15));
        shapes.add(new Triangle(0, 0, 4, 0, 2, 3));
    
        AreaCalculatorVisitor areaCalculator = new AreaCalculatorVisitor();

        for(Shape shape : shapes){
            shape.accept(areaCalculator);
        }

        CornerPrinterVisitor cornerPrinter = new CornerPrinterVisitor();
        for(Shape shape : shapes){
            shape.accept(cornerPrinter);
        }
    }
   
}