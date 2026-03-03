package P7_State_p3.src.Levels;

import P7_State_p3.src.Character;
import P7_State_p3.src.State;
import P7_State_p3.src.Activities.TrainingState;

public class NoviceState extends State {

    public NoviceState(Character character){
        super(character);
    }

    public void action(){
        String[] options = {"Train"};
        switch(this.getCharacter().readUserChoice(options)){
            case 1:
                this.getCharacter().setState(new TrainingState(this.getCharacter()));
                break;
        }
    }
    
}
