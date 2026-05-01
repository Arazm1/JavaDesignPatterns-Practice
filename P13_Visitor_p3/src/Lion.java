package P13_Visitor_p3.src;

public class Lion implements IAnimal{

    private String name;
    private double weightKg;
    private double maneLength;

    public Lion(String name, double weightKg, double maneLength){
        this.name = name;
        this.weightKg = weightKg;
        this.maneLength = maneLength;
    }

    public String getName(){
        return this.name;
    }

    public double getWeightKg(){
        return this.weightKg;
    }

    public double getManeLength(){
        return this.maneLength;
    }


    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}