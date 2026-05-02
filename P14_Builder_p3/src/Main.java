package P14_Builder_p3.src;

public class Main {
    public static void main(String[] args) {
        
        //Margherita
        PizzaBuilder margheritaPizza = new MargheritaBuilder();
        Director director1 = new Director(margheritaPizza);

        director1.constructMargheritaPizza();
        Pizza margherita = margheritaPizza.getPizza();

        System.out.println("Margherita Pizza:");
        System.out.println(margherita);


        //Kebab pizza
        PizzaBuilder kebabBuilder = new KebabPizzaBuilder();
        Director director2 = new Director(kebabBuilder);

        director2.constructKebabPizza();
        Pizza kebab = kebabBuilder.getPizza();

        System.out.println("Kebab Pizza:");
        System.out.println(kebab);
    }
    
}
