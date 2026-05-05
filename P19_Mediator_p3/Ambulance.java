package P19_Mediator_p3;

public class Ambulance implements Department{

    private IDispatchCenter dispatchCenter;
    
    public Ambulance(IDispatchCenter dispatchCenter){
        this.dispatchCenter = dispatchCenter;
    }

    @Override
    public void send(String message) {
        dispatchCenter.notify(this, message);      
    }

    @Override
    public void receive(String message) {
        System.out.println("Ambulance received: " + message);
    }

    
    
}
