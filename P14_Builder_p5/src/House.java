package P14_Builder_p5.src;


import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Part> parts;

    public House(){
        this.parts = new ArrayList<>();
    }

    public void addPart(Part part){
        this.parts.add(part);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Part part : parts){
            sb.append(part.getName());
            sb.append("\n");
        }

        return sb.toString();
    }
    
}
