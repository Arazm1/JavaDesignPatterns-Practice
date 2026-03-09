package P6_Decorator_p2.src;

public class CoffeeDecorator implements Coffee{

    public Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost();
    }
    
}
