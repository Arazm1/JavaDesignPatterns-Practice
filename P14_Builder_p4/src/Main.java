package P14_Builder_p4.src;

public class Main {
    public static void main(String[] args){

        //Large Modern House
        HouseBuilder largeModernHouse = new ModernHouseBuilder();
        Director director1 = new Director(largeModernHouse);

        director1.constructLargeModernHouse();
        House largeModern = largeModernHouse.getHouse();
        System.out.println("Large Modern house with garage");
        System.out.println(largeModern);


        HouseBuilder smallModernHouse = new ModernHouseBuilder();
        Director director2 = new Director(smallModernHouse);

        director2.constructSmallModernHouse();
        House smallModern = smallModernHouse.getHouse();
        System.out.println("Small Modern house with garage");
        System.out.println(smallModern);
    }
    
}
