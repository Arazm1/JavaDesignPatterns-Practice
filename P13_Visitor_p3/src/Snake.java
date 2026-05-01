package P13_Visitor_p3.src;

public class Snake implements IAnimal{

    private String name;
    private double weightKg;
    private double lengthM;

    public Snake(String name, double weightKg, double lengthM){
        this.name = name;
        this.weightKg = weightKg;
        this.lengthM = lengthM;
    }

    public String getName(){
        return this.name;
    }

    public double getWeightKg(){
        return this.weightKg;
    }

    public double getLengthM(){
        return this.lengthM;
    }


    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
}
