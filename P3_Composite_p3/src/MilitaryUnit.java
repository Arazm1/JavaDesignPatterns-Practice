package P3_Composite_p3.src;

import java.util.ArrayList;
import java.util.List;

public class MilitaryUnit extends Component{

    List<Component> children = new ArrayList<>();

    public MilitaryUnit(String name){
        super(name);
    }

    @Override
    public void add(Component component){
        this.children.add(component);
    }

    @Override
    public void remove(Component component){
        this.children.remove(component);
    }

    @Override
    public Component getChild(int index){
        return this.children.get(index);
    }

    @Override
    public void printData(){
        System.out.println(this.name);
        for(Component c : children){
            System.out.print("  ");
            c.printData();
        }

    }
    
}
