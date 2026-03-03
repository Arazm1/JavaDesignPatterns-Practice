package P7_State_p3.src;

public abstract class State {
    private Character character;

    public State(Character character){
        this.character = character;
    }

    public Character getCharacter(){
        return this.character;
    }

    public abstract void action();
    
}
