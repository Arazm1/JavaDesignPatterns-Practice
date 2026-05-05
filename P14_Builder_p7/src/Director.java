package P14_Builder_p7.src;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constructMeal(){
        builder.buildMealStep1();
        builder.buildMealStep2();
        builder.buildMealStep3();
    }
    
}
