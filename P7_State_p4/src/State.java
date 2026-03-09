package P7_State_p4.src;

public abstract class State {
    private TrafficLight trafficLight;

    public State(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    
    public TrafficLight getTrafficLight(){
        return this.trafficLight;
    }

    abstract void nextState();
    
}
