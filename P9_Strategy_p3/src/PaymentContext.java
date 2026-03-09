package P9_Strategy_p3.src;


public class PaymentContext {
    private PaymentStrategy paymentStrategy;


    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy(){
        return this.paymentStrategy;
    }

    public boolean processPayment(double amount){
        return paymentStrategy.processPayment(amount);
    }
    
}
