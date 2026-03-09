package P7_State_p4.src;

public class GreenLightState extends State {

    public GreenLightState(TrafficLight trafficLight){
        super(trafficLight);
        this.getTrafficLight().showLight();
    }

    public void nextState(){
        System.out.println("Current light: Green.");
        System.out.println("Light is turning..");
        this.getTrafficLight().setState(new YellowLightState(this.getTrafficLight()));
    }
    
}
