package P6_Decorator_p6.src;

public class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void send(String message){
        component.send(message);
    }
    
}
