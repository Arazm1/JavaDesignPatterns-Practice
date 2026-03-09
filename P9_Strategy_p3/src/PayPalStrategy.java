package P9_Strategy_p3.src;

public class PayPalStrategy implements PaymentStrategy{

    @Override
    public boolean processPayment(double amount){

        System.out.println("Server down..");
        System.out.println("But money gone nevertheless.");
        return true;
    }
    
}
