package P14_Builder_p5.src;

public class Main {
    public static void main(String[] args){

        Director director = new Director(null);

        //Large Modern house with garage
        HouseBuilder largeModernHouse = new ModernHouseBuilder();
        director.setBuilder(largeModernHouse);
        director.constructLargeModernHouse();

        System.out.println("Large Modern house with garage");
        System.out.println(largeModernHouse.getHouse());


        //Small Modern house with NO garage
        HouseBuilder smallModernHouse = new ModernHouseBuilder();
        director.setBuilder(smallModernHouse);
        director.constructSmallModernHouse();

        System.out.println("Small Modern house with NO garage");
        System.out.println(smallModernHouse.getHouse());



    }
    
}