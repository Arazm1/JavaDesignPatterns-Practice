package P7_State.src;

public abstract class State {
    private Machine machine;

    public State(Machine machine){
        this.machine = machine;
    }

    public Machine getMachine(){
        return this.machine;
    }

    abstract void action();   
}
