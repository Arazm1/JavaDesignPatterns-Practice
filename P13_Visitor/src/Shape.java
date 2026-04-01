package P13_Visitor.src;

public interface Shape {
    void accept(ShapeVisitor visitor);
    
}
