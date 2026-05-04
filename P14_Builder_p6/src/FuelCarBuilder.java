package P14_Builder_p6.src;

public class FuelCarBuilder implements CarBuilder {

    private Car car;

    public FuelCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.addCarPart(new CarPart("Gas Engine"));
    }

    @Override
    public void buildWheels() {
        car.addCarPart(new CarPart("4 Wheels"));
    }

    @Override
    public void buildBattery() {
        // Fuel cars still include a small battery
        car.addCarPart(new CarPart("Small Battery"));
    }

    @Override
    public void buildFuelTank() {
        car.addCarPart(new CarPart("Fuel Tank (50L)"));
    }

    public Car getCar() {
        return this.car;
    }
}