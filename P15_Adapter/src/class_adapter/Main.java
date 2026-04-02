package P15_Adapter.src.class_adapter;

import P15_Adapter.src.calculator.PizzaCalculator;

public class Main {
    public static void main(String[] args) {
        
        //calculator
        PizzaCalculator calculator = new PizzaCalculator();
        //class_adapter
        P15_Adapter.src.class_adapter.PizzaCalculator adapter = new PizzaAdapter();


        //Round pizza - calculator directly
        double price1 = calculator.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1);

        //via adapter
        double price1ViaAdapter= adapter.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1ViaAdapter);

        //adapter for sheet (Rectangular) pizza
        double price2 = adapter.calculatePricePerSquareMeter(37, 17, 13);
        System.out.println(price2);
    }
    
}
