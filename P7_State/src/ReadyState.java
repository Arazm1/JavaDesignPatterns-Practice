package P7_State.src;

public class ReadyState extends State{

    public ReadyState(Machine machine){
        super(machine);
        this.getMachine().clearBalance();
    }

    public void action(){
        String[] options = {"Buy tickets"};
        switch(this.getMachine().readUserChoice(options)){
            case 1:
                this.getMachine().setState(new TicketSelectionState(this.getMachine()));
                break;
        }
    }
    
}
