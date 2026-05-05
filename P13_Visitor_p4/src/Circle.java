package P13_Visitor_p4.src;

//Concrete Element
public class Circle implements Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
