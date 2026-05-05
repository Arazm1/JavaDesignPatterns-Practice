package P19_Mediator_p3;

//Concrete Mediator
public class EmergencyDispatch implements IDispatchCenter{

    private FireTruck fireTruck;
    private PoliceCar policeCar;
    private Ambulance ambulance;

    public EmergencyDispatch(){}

    @Override
    public void notify(Department sender, String message) {
        //Routing logic 1: If FireTruck reports a fire
        if (sender == fireTruck && message.equals("FIRE_REPORTED")) {
            System.out.println("\n[DISPATCH] Fire reported! Coordinating response...");
            //Inform Police and Ambulance what to do
            if (policeCar != null) policeCar.receive("BLOCK_ROADS");
            if (ambulance != null) ambulance.receive("WAIT_NEARBY");
        }
        
        //Routing logic 2: If PoliceCar needs crowd control
        else if (sender == policeCar && message.equals("CROWD_CONTROL_NEEDED")) {
            System.out.println("\n[DISPATCH] Crowd control requested! Alerting medics...");
            //Only the Ambulance needs to react to this
            if (ambulance != null) ambulance.receive("PREPARE_FOR_PATIENTS");
        }
    }   
}