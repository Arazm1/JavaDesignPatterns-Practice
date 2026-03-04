package P8_Template_Method.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Espresso: ");
        CoffeeRecipe espresso = new EspressoRecipe();
        espresso.makeCoffee();
        
    }
    
}
