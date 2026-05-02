package P21_Facade_p2.src;

public class Projector implements IProjector{

    @Override
    public void on() {
        System.out.println("Turning the Projector ON");
    }

    @Override
    public void off() {
        System.out.println("Turning the Projector OFF");
    }

    @Override
    public void setInput(String input) {
        System.out.println("Input set to " + input);
    }
    
}
