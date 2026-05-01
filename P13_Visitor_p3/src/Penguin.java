package P13_Visitor_p3.src;

public class Penguin implements IAnimal{

    private String name;
    private double weightKg;
    private double swimSpeedKmh;

    public Penguin(String name, double weightKg, double swimSpeedKmh){
        this.name = name;
        this.weightKg = weightKg;
        this.swimSpeedKmh = swimSpeedKmh;
    }

    public String getName(){
        return this.name;
    }

    public double getWeightKg(){
        return this.weightKg;
    }

    public double getSwimSpeedKmh(){
        return this.swimSpeedKmh;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}