package P8_Template_Method.src;

public class EspressoRecipe extends CoffeeRecipe{

    @Override
    public void addIngredients(){
        System.out.println("Espresso is prepared without additives..");
    }

    @Override
    public void pourInCup(){
        System.out.println("Prepared espresso is poured into a small cup..");
    }

    @Override
    public void serveCoffee(){
        System.out.println("Serving espresso..");
        serveWithChocolate();
    }

    private void serveWithChocolate(){
        System.out.println("Serving chocolate with espresso..");
    }
}
