package P13_Visitor_p2.src;

public interface Visitor {
    void visit(Rectangle rectangle);
    void visit(Line line);
    void visit(Triangle triangle);
    
}
