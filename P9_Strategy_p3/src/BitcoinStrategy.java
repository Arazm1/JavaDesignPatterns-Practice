package P9_Strategy_p3.src;

public class BitcoinStrategy implements PaymentStrategy{ 

    @Override
    public boolean processPayment(double amount){
        System.out.println("Processing Bitcoin payment...");
        int tries = 0;
        do {
            System.out.println("Trying to connect to the server...");
            System.out.println("ewonwkcmwnpocwnkw");
            System.out.println("ewonwkqd kö qp");
            System.out.println("ewonwkwfopmkwndoqmcmwnpocwnkw");
            System.out.println("ewongvoempnfw+komw");
            System.out.println("ewoqdqpnkw"); 
            tries++;    
        } while (tries <10);

        System.out.println("Connected to the server..");
        delayTime(1000);
        System.out.println("Processing the payment..");
        delayTime(2000);

        System.out.println("Payment successful!");
        return true;
    }


    private void delayTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
