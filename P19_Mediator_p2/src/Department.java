package P19_Mediator_p2.src;

//Colleague
public interface Department {
    void sendTransfer(String message);
    void receivePatient(String message);
    String getName();
    
}
