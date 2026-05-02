package P19_Mediator_p2.src;

public class Main {
    public static void main(String[] args) {
        
        HospitalConcreteMediator mediator = new HospitalConcreteMediator();

        Department emergency = new EmergencyDepartment(mediator);
        Department icu = new ICU(mediator);
        Department ward = new GeneralWard(mediator);

        mediator.registerDepartment(emergency);
        mediator.registerDepartment(icu);
        mediator.registerDepartment(ward);

        emergency.sendTransfer("critical patient");
        icu.sendTransfer("recovering patient");
        ward.sendTransfer("attempted transfer");

    }
    
}
