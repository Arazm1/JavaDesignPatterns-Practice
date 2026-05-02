package P19_Mediator_p2.src;

//Colleague
public class ICU implements Department {

    private HospitalMediator mediator;
    private String name;

    public ICU(HospitalMediator mediator){
        this.mediator = mediator;
        this.name = "ICU";
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
