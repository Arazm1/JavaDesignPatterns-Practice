package P14_Builder_p3.src;

import java.util.ArrayList;
import java.util.List;

//Product
public class Pizza {
    private List<Ingredient> ingredients;

    public Pizza(){
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient newIngredient){
        this.ingredients.add(newIngredient);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Ingredient ingredient : ingredients){
            sb.append(ingredient.getName());
            sb.append("\n");
        }

        return sb.toString();
    }
    
}
