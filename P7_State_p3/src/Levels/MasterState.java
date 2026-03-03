package P7_State_p3.src.Levels;

import P7_State_p3.src.Character;
import P7_State_p3.src.State;

public class MasterState extends State{

    public MasterState(Character character){
        super(character);
    }

    @Override
    public void action(){
        System.out.println("The WORK is done.");
        return;
    }
    
}
