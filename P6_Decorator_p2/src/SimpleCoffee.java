package P6_Decorator_p2.src;

//Concrete Component
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription(){
        return "Simple Coffee";
    }

    @Override
    public double getCost(){
        return 5.0;
    }
    
}
