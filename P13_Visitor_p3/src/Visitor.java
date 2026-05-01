package P13_Visitor_p3.src;

public interface Visitor {
    void visit(Lion lion);
    void visit(Penguin penguin);
    void visit(Snake snake);
    
}
