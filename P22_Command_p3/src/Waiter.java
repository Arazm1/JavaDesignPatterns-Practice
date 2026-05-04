package P22_Command_p3.src;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Waiter {
    private List<Command> orders;

    public Waiter(){
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Command command){
        orders.add(command);
    }

    public void sendOrdersToKitchen(){
        if(!orders.isEmpty()){
            for(Command order : orders){
                order.execute();
            }
            orders.clear();
            System.out.println("All orders have been sent.");
        }
        else{
            System.out.println("No orders to send!");
        }
    }
    
}
