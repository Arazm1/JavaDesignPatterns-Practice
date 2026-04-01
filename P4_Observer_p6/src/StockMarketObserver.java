package P4_Observer_p6.src;

public class StockMarketObserver implements Observer{

    private String name;
    
    public StockMarketObserver(String name){
        this.name = name;
    }

    @Override
    public void update(double amount){
        System.out.println("Update sent to: " + this.name + " stock value increaed: " + amount);
    }
}
