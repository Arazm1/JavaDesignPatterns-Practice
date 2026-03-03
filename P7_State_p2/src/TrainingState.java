package P7_State_p2.src;

public class TrainingState extends State {

    public TrainingState(Character character){
        super(character);
    }

    public void action(){
        System.out.println("Current Level: ");
        System.out.println(this.getCharacter().getLevel());
        //lälä
    }
    
}
