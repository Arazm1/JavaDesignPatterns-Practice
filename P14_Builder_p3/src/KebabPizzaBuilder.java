package P14_Builder_p3.src;

public class KebabPizzaBuilder implements PizzaBuilder{

    private Pizza pizza;

    public KebabPizzaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void addDough() {
        pizza.addIngredient(new Ingredient("Regular crust dough"));
    }

    @Override
    public void addSauce() {
        pizza.addIngredient(new Ingredient("Tomato sauce"));
    }

    @Override
    public void addCheese() {
        pizza.addIngredient(new Ingredient("Mozzarella"));
    }

    @Override
    public void addToppings() {
        pizza.addIngredient(new Ingredient("Kebab meat"));
        pizza.addIngredient(new Ingredient("Onion"));
        pizza.addIngredient(new Ingredient("Tomato"));
        pizza.addIngredient(new Ingredient("Garlic sauce"));
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    
    
}
