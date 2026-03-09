package P7_State_p4.src;

public class RedLightState extends State{

    public RedLightState(TrafficLight trafficLight){
        super(trafficLight);
        this.getTrafficLight().showLight();
    }

    public void nextState(){
        System.out.println("Current light: Red.");
        System.out.println("Light is turning..");
        this.getTrafficLight().setState(new YellowLightState(this.getTrafficLight()));
    }
    
}
