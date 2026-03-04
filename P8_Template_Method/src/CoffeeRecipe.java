package P8_Template_Method.src;

public abstract class CoffeeRecipe {

    public final void makeCoffee(){
        boilWater();
        addCoffee();
        pourInCup();
        addIngredients();
        serveCoffee();
    }

    public void boilWater(){
        System.out.println("Boiling water...");
    }

    public void addCoffee(){
        System.out.println("Adding coffee to water..");
    }

    public void pourInCup(){
        System.out.println("Pouring prepared coffee in a cup..");
    }

    public abstract void addIngredients();

    public void serveCoffee(){
        System.out.println("Serving coffee..");
    }
}