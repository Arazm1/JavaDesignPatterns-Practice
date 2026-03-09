package P9_Strategy_p3.src;

import java.util.Scanner;

public class CreditCardStrategy implements PaymentStrategy {

    private final Scanner scanner = new Scanner(System.in);
    @Override
    public boolean processPayment(double amount){
        System.out.println("Processing the credit card payment..");
        System.out.print("Enter PIN code: ");
        int pinCode = scanner.nextInt();

        while(pinCode>4){
            System.out.println("Wrong PIN code! Try again:");
            pinCode = scanner.nextInt();
        }

        System.out.println("Payment successful!");
        return true;
    }
    
}
