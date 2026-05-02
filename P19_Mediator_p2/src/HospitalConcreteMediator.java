package P19_Mediator_p2.src;

import java.util.ArrayList;
import java.util.List;

public class HospitalConcreteMediator implements HospitalMediator{

    private List<Department> departments;

    public HospitalConcreteMediator(){
        this.departments = new ArrayList<>();
    }

    public void registerDepartment(Department department){
        this.departments.add(department);
    }

    /**
     * Routes to correct department based on name
     */
    @Override
    public void transferPatient(Department sender, String message){
        for(Department department : departments){
            if(shouldReceive(sender, department)){
                department.receivePatient(message);
                return;
            }
        }
        System.out.println("Transfer denied.");
        

    }

    public boolean shouldReceive(Department sender, Department receiver){
        if(receiver == sender){
            return false;
        }

        if(sender.getName().equals("Emergency")){
            return receiver.getName().equals("ICU") || receiver.getName().equals("GeneralWard");
        }
        if(sender.getName().equals("ICU")) {
            return receiver.getName().equals("GeneralWard");
        }
        return false;
    }
    
}
