package P14_Builder_p4.src;

//Concrete builder
public class SimpleHouseBuilder implements HouseBuilder {

    private House house;

    public SimpleHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.addPart(new Part("Basic concrete foundation"));
    }

    @Override
    public void buildWalls() {
        house.addPart(new Part("Brick walls"));
    }

    @Override
    public void buildRoof() {
        house.addPart(new Part("Standard pitched roof"));
    }

    @Override
    public void buildWindows() {
        house.addPart(new Part("Standard double-glazed windows"));
    }

    @Override
    public void buildGarage() {
        //No garage for simple house
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}