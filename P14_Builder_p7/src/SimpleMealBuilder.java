package P14_Builder_p7.src;

public class SimpleMealBuilder implements Builder{

    private Meal meal;
    
    public SimpleMealBuilder(){
        this.meal = new Meal();
    }

    @Override
    public void buildMealStep1() {
        meal.addIngredient(new Ingredient("Ingredient 1"));
    }

    @Override
    public void buildMealStep2() {
        meal.addIngredient(new Ingredient("Ingredient 2"));
    }

    @Override
    public void buildMealStep3() {
        meal.addIngredient(new Ingredient("Ingredient 3"));
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }

    
    
}
