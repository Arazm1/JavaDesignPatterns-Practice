package P14_Builder_p6.src;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<CarPart> carParts;

    public Car(){
        this.carParts = new ArrayList<>();
    }


    public void addCarPart(CarPart carPart){
        this.carParts.add(carPart);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(CarPart part : carParts){
            sb.append(part.getName());
            sb.append("\n");
        }

        return sb.toString();
    }
    
}
