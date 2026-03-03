package P7_State_p3.src.Activities;

import P7_State_p3.src.Character;
import P7_State_p3.src.State;
import P7_State_p3.src.Levels.ExpertState;
import P7_State_p3.src.Levels.IntermediateState;
import P7_State_p3.src.Levels.MasterState;
import P7_State_p3.src.Levels.NoviceState;

public class MeditateState extends State{

    public MeditateState(Character character){
        super(character);
    }

    @Override
    public void action(){

        getCharacter().printCharacterStats();
        String[] options = {"Meditate"};
        switch(this.getCharacter().readUserChoice(options)){
            case 1 -> meditate();
        }

        //Level-Up check
        /*
        if(getCharacter().getXPPoints() >= 300){
            System.out.println("You have leveled up to Master Level!");
            getCharacter().setLevel(Character.levelType.Master);
            getCharacter().setState(new MasterState(this.getCharacter()));
        }
        else if(getCharacter().getXPPoints() >= 200){
            System.out.println("You have leveled up to Expert Level!");
            getCharacter().setLevel(Character.levelType.Expert);
            getCharacter().setState(new ExpertState(this.getCharacter()));
        }
        else if(getCharacter().getXPPoints() >= 100){
            System.out.println("You have leveled up to Intermediate Level!");
            getCharacter().setLevel(Character.levelType.Master);
            getCharacter().setState(new IntermediateState(this.getCharacter()));
        }
        else{
            getCharacter().setState(new NoviceState(this.getCharacter()));
        }
        */

    }


    private void meditate(){
        this.getCharacter().addHealthPoints(10);
    }
    
}
