package P6_Decorator_p6.src;

public class Main {
    public static void main(String[] args){

        Component component;

        component = new ConcreateDecorator1(new ConcreateComponent());
        component.send("HI");

        
    }
    
}
