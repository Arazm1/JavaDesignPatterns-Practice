package P14_Builder_p6.src;

public class Main {
    public static void main(String[] args) {
        
        CarBuilder electricCarBuilder = new ElectricCarBuilder();
        Director director1 = new Director(electricCarBuilder);
        director1.constructCar();

        Car car1 = electricCarBuilder.getCar();
        System.out.println(car1);


    }    
}
