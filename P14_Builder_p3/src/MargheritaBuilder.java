package P14_Builder_p3.src;

//Concrete Builder
//defines what each step actually does (which ingredients get added)
public class MargheritaBuilder implements PizzaBuilder{

    private Pizza pizza;

    public MargheritaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void addDough() {
        pizza.addIngredient(new Ingredient("Thin crust dough"));
    }

    @Override
    public void addSauce() {
        pizza.addIngredient(new Ingredient("Tomato sauce"));
    }

    @Override
    public void addCheese() {
        pizza.addIngredient(new Ingredient("Fresh mozzarella"));
    }

    @Override
    public void addToppings() {
        pizza.addIngredient(new Ingredient("Basil"));
        pizza.addIngredient(new Ingredient("Olive oil"));
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    
    
}
