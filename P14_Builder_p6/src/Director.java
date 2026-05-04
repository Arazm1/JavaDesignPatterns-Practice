package P14_Builder_p6.src;

//Director
//Controls what gets built
public class Director {

    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void setBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void constructCar(){
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildBattery();
        carBuilder.buildFuelTank();
    }
    
}
