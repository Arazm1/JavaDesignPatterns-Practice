package P14_Builder_p3.src;

//Builder
public interface PizzaBuilder {
    void addDough();
    void addSauce();
    void addCheese();
    void addToppings();
    Pizza getPizza();
    
}
