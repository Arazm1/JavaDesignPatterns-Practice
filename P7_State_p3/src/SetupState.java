package P7_State_p3.src;

import P7_State_p3.src.Levels.NoviceState;

public class SetupState extends State{

    public SetupState(Character character){
        super(character);
        this.getCharacter().askName();

    }


    public void action(){
        this.getCharacter().setState(new NoviceState(this.getCharacter()));
    }
    
}
