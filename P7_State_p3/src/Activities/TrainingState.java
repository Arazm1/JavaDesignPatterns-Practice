package P7_State_p3.src.Activities;

import P7_State_p3.src.Character;
import P7_State_p3.src.State;
import P7_State_p3.src.Levels.ExpertState;
import P7_State_p3.src.Levels.IntermediateState;
import P7_State_p3.src.Levels.MasterState;
import P7_State_p3.src.Levels.NoviceState;

public class TrainingState extends State {

    public TrainingState(Character character){
        super(character);
    }

    @Override
    public void action(){

        getCharacter().printCharacterStats();

        String[] options = {"Strength Training", "Endurance Training", "Intense Training"};
        switch(this.getCharacter().readUserChoice(options)){
            case 1 -> strengthTraining();
            case 2 -> enduranceTraining();
            case 3 -> intenseTraining();
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


    //Todo: Randomize points
    private void strengthTraining(){
        this.getCharacter().addXPPoints(10);
        this.getCharacter().addHealthPoints(-5);
    }

    private void enduranceTraining(){
        this.getCharacter().addXPPoints(15);
        this.getCharacter().addHealthPoints(-5);
    }

    private void intenseTraining(){
        this.getCharacter().addXPPoints(20);
        this.getCharacter().addHealthPoints(-5);
    }
    
}
