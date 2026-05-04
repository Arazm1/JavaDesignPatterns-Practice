package P14_Builder_p6.src;

//Builder
public interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildBattery();
    void buildFuelTank();
    Car getCar();
    
}
