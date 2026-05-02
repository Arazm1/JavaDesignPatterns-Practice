package P14_Builder_p5.src;

//Concrete builder
public class ModernHouseBuilder implements HouseBuilder {

    private House house;

    public ModernHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.addPart(new Part("Concrete foundation with insulation"));
    }

    @Override
    public void buildWalls() {
        house.addPart(new Part("Glass and steel walls"));
    }

    @Override
    public void buildRoof() {
        house.addPart(new Part("Flat roof with solar panels"));
    }

    @Override
    public void buildWindows() {
        house.addPart(new Part("Large panoramic windows"));
    }

    @Override
    public void buildGarage() {
        house.addPart(new Part("Smart garage with automatic door"));
    }

    @Override
    public House getHouse() {
        return house;
    }
}