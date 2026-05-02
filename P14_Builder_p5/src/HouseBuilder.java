package P14_Builder_p5.src;

public interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildWindows();
    void buildGarage();
    House getHouse();
    
}
