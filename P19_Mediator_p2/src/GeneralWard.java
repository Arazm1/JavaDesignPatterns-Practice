package P19_Mediator_p2.src;

//ConcreteColleague
public class GeneralWard implements Department{

    private HospitalMediator mediator;
    private String name;

    public GeneralWard(HospitalMediator mediator){
        this.mediator = mediator;
        this.name = "GeneralWard";
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void sendTransfer(String message){
        mediator.transferPatient(this, message);
    }

    @Override
    public void receivePatient(String message){
        System.out.println("Emergency received: " + message);
    }
    
}
