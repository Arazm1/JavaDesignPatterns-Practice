package P13_Visitor.src;

public interface ShapeVisitor {
    void visit(Rectangle rectangle);
    void visit(Line line);
    void visit(Triangle triangle);
    
}
