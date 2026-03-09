package P6_Decorator_p2.src;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        //Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        //System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.getCost());
    }
}
