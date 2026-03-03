package P7_State_p3.src.Levels;

import P7_State_p3.src.State;
import P7_State_p3.src.Character;
import P7_State_p3.src.Activities.MeditateState;
import P7_State_p3.src.Activities.TrainingState;

public class ExpertState extends State {

    public ExpertState(Character character){
        super(character);
    }

    public void action(){
        String[] options = {"Train", "Meditate"};
        switch(this.getCharacter().readUserChoice(options)){
            case 1:
                this.getCharacter().setState(new TrainingState(this.getCharacter()));
                break;
            case 2:
                this.getCharacter().setState(new MeditateState(this.getCharacter()));
                break;
            case 3:
                this.getCharacter().setState(new MeditateState(this.getCharacter()));
                break;
        }
    }
}
