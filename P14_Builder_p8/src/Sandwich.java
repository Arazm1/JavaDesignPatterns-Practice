package P14_Builder_p8.src;

import java.util.ArrayList;
import java.util.List;

//Product
public class Sandwich {

    private List<String> ingredients;

    public Sandwich(){
        this.ingredients = new ArrayList<>();
    }

    public void add(String ingredients){
        this.ingredients.add(ingredients); 
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String ingredient : this.ingredients){
            sb.append(ingredient);
            sb.append("\n");
        }

        return sb.toString();
    } 
}