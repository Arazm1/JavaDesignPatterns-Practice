package P15_Adapter.src.object_adapter;


public class Main {
    public static void main(String[] args) {
        P15_Adapter.src.calculator.PizzaCalculator calculator = new P15_Adapter.src.calculator.PizzaCalculator();
        PizzaCalculator adapter = new PizzaAdapter(calculator);

        //Round pizza
        double price1 = calculator.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1);

        //Via adapter
        double price1ViaAdapter = adapter.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1ViaAdapter);

        //Sheet pizza - via adapter
        double price2 = adapter.calculatePricePerSquareMeter(37, 17, 13);
        System.out.println(price2);

    }
    
}
