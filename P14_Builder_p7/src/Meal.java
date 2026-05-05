package P14_Builder_p7.src;

import java.util.ArrayList;
import java.util.List;

//Product
public class Meal {
    private List<Ingredient> ingredients;

    public Meal(){
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Ingredient ingredient : this.ingredients){
            sb.append(ingredient.getName());
            sb.append("\n");
        }

        return sb.toString();
    }
    
}
