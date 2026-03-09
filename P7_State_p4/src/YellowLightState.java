package P7_State_p4.src;

public class YellowLightState extends State{

    public YellowLightState(TrafficLight trafficLight){
        super(trafficLight);
        this.getTrafficLight().showLight();
    }

    public void nextState(){
        System.out.println("Current light Yellow");
        System.out.println("Light is turning..");
        boolean which = Math.random() > 0.5;

        if(which){
            this.getTrafficLight().setState(new RedLightState(this.getTrafficLight()));
        }
        else{
            this.getTrafficLight().setState(new GreenLightState(this.getTrafficLight()));
        }
    }


    
}
