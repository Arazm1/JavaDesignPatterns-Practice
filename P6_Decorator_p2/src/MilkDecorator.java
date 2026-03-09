package P6_Decorator_p2.src;

public class MilkDecorator extends CoffeeDecorator{
    
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
    
}
