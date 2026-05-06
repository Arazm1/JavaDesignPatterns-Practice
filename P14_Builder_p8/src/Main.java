package P14_Builder_p8.src;

public class Main {
    public static void main(String[] args) {
        

        MeatSandwichBuilder meatSandwichBuilder = new MeatSandwichBuilder();
        Director director = new Director(meatSandwichBuilder);

        director.construct();

        Sandwich sandwich = meatSandwichBuilder.getSandwich();
        System.out.println(sandwich);
    }
    
}
