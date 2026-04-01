package P4_Observer_p6.src;

public class Main {
    public static void main(String[] args){

        StockMarket stockMarket = new StockMarket();

        StockMarketObserver stockMarketObserver = new StockMarketObserver("Investor1");
        StockMarketObserver stockMarketObserver2 = new StockMarketObserver("Investor2");

        stockMarket.subscribe(stockMarketObserver);
        stockMarket.subscribe(stockMarketObserver2);

        stockMarket.updateStockValue(100);

        stockMarket.updateStockValue(200);



    }
    
}
