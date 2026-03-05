package P9_Strategy.src;

import java.util.Scanner;

public class OnlineStore {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        PaymentContext paymentHandler = new PaymentContext(new CashPayment());

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Select payment method: ");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Gift Card");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 -> paymentHandler.setStrategy(new CashPayment());
            case 2 -> paymentHandler.setStrategy(new CardPayment());
            case 3 -> paymentHandler.setStrategy(new GiftCardPayment());
            default ->{
                System.out.println("Invalid");
                return;
            }
        }


        boolean paymentSuccessful = paymentHandler.processPayment(amount);
        if(paymentSuccessful){
            System.out.println("Payment successful!");
        }
        else{
            System.out.println("Payment failed!");
        }
    }
    
}
