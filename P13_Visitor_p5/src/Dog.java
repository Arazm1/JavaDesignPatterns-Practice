package P13_Visitor_p5.src;

//ConcreteElement
public class Dog implements IAnimal {

    private String name;
    private double weightKg;

    public Dog(String name, double weightKg){
        this.name = name;
        this.weightKg = weightKg;
    }

    public String getName(){
        return this.name;
    }

    public double weightKg(){
        return this.weightKg;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        
    }
}
