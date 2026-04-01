package P4_Observer_p6.src;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{

    private List<Observer> observers;
    private double currentStock;


    public StockMarket(){
        this.observers = new ArrayList<>();
        this.currentStock = 0;
    }

    @Override
    public void subscribe(Observer observer){
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer){
        this.observers.add(observer);
    }

    @Override
    public void notifySubscribers(){
        for(Observer o : observers){
            o.update(this.currentStock);
        }
    }

    public void updateStockValue(double amount){
        this.currentStock = amount;
        notifySubscribers();
    }
    
}
