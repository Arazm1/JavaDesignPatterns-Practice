package P7_State_p2.src;

import P7_State_p2.src.Character.levelType;

public class ActivitySelectionState extends State {

    public ActivitySelectionState(Character character){
        super(character);
    }


    public void action(){
        System.out.println(getCharacter().getLevel());

        if(getCharacter().getLevel().equals(levelType.Novice)){
            String[] options = {"Train"};

            switch(this.getCharacter().readUserChoice(options)){
                case 1:
                    System.out.println("Starting training..");
                    this.getCharacter().setState(new TrainingState(this.getCharacter()));
                    break;
            }
        }

        if(getCharacter().getLevel().equals(levelType.Intermediate)){
            String[] options = {"Train", "Meditate"};

            switch(this.getCharacter().readUserChoice(options)){
                case 1:
                    System.out.println("Starting training..");
                    this.getCharacter().setState(new TrainingState(this.getCharacter()));
                    break;
                case 2:
                    System.out.println("Starting meditation..");
                    //this.getCharacter().setState(new MeditateState(this.getCharacter()));
                    break;

            }
        }
    }


    
}
