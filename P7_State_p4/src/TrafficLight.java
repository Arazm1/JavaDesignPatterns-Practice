package P7_State_p4.src;

public class TrafficLight {
    private State state;
    private String light;

    public TrafficLight(){
        state = new RedLightState(this);
    }


    public void operate() {
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("Machine out of order");
                return;
            }
            state.nextState();
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public String showLight(){
        return this.light;
    }

}
