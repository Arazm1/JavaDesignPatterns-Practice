package P9_Strategy.src;

import java.util.Scanner;

public class CashPayment implements PaymentStrategy {

    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean processPayment(double amount){
        System.out.println("Processing cash payment: $" + amount);
        System.out.println("Enter amount of cash: ");
        double cash = scanner.nextDouble();
        if(cash < amount){
            System.out.println("Insufficient cash!");
            return false;
        }
        System.out.println("Your change: $" + (cash - amount));
        return true;
    }
}
