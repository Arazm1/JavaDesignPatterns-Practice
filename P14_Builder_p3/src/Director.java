package P14_Builder_p3.src;

//Director
//decides which steps are executed and in what order
public class Director {

    private PizzaBuilder builder;

    public Director(PizzaBuilder builder){
        this.builder = builder;
    }

    public void constructMargheritaPizza(){
        builder.addDough();
        builder.addSauce();
        builder.addCheese();
        builder.addToppings();
        //builder.getPizza();
    }

    public void constructKebabPizza(){
        builder.addDough();
        builder.addSauce();
        builder.addCheese();
        builder.addToppings();
    }
    
}
