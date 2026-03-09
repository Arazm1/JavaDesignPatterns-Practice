package P9_Strategy_p3.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        PaymentContext paymentContext = new PaymentContext(new CreditCardStrategy());

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Select payment method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. Bitcoin");
        System.out.println("3. PayPal");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 -> paymentContext.setStrategy(new CreditCardStrategy());
            case 2 -> paymentContext.setStrategy(new BitcoinStrategy());
            //case 3 -> paymentContext.setStrategy(new PayPalStrategy());
        }

        boolean paymentSuccessful = paymentContext.processPayment(amount);
        if(paymentSuccessful){
            System.out.println("All good");
        }
        else{
            System.out.println("Nope.");
        }
    }
    
}
