package P14_Builder_p6.src;

public class ElectricCarBuilder implements CarBuilder {

    private Car car;

    public ElectricCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.addCarPart(new CarPart("Electric Motor"));
    }

    @Override
    public void buildWheels() {
        for (int i = 0; i < 4; i++) {
            car.addCarPart(new CarPart("Wheel"));
        }
    }

    @Override
    public void buildBattery() {
        car.addCarPart(new CarPart("Large Battery Pack"));
    }

    @Override
    public void buildFuelTank() {
        //Electric cars don’t have fuel tanks
        //You can either:
        //1. Do nothing
        //2. Add a placeholder
        //car.addCarPart(new CarPart("No Fuel Tank"));

        //We do nothing this time.
    }

    public Car getCar() {
        return this.car;
    }
}