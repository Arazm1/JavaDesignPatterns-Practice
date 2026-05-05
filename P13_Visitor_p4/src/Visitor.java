package P13_Visitor_p4.src;

//Visitor
public interface Visitor {
    void visit(Rectangle rectangle);
    void visit(Circle circle);
}
