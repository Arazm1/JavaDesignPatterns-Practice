package P14_Builder_p7.src;

public class Main {
    public static void main(String[] args) {
        
        Builder simpleMealBuilder = new SimpleMealBuilder();
        Director director = new Director(simpleMealBuilder);
        director.constructMeal();

        Meal meal = simpleMealBuilder.getMeal();
        System.out.println(meal);
    }
    
}
