package P7_State_p2.src;

public class SetupState extends State{

    public SetupState(Character character){
        super(character);
        this.getCharacter().askName();

    }


    public void action(){
        //String[] options = {choices.ChangeName};
        //switch(this.getCharacter().readUserChoice(options)){
        //    case 1:
        //        this.getCharacter().setState(new TrainingState(this.getCharacter()));
        //        break;
        //}
    }
    
}
