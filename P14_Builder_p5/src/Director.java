package P14_Builder_p5.src;

//Director
//Controls what gets built
public class Director {

    private HouseBuilder builder;

    public Director(HouseBuilder builder){
        this.builder = builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructLargeModernHouse(){
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildWindows();
        builder.buildGarage();
    }

    //No garage
    public void constructSmallModernHouse(){
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildWindows();
    }

    public void constructSimpleHouse(){
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildWindows();
        builder.buildRoof();
        builder.buildGarage(); //the method has nothing inside
    }
    
}
