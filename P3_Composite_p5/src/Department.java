package P3_Composite_p5.src;

import java.util.ArrayList;
import java.util.List;

//Concreate class Composite
public class Department extends Component{

    private List<Component> children;

    public Department(String name){
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void printData(){
        System.out.println(this.name);
        for(Component c : children){
            c.printData();
        }
    }

    @Override
    public void add(Component component){
        children.add(component);
    }

    @Override
    public void remove(Component component){
        children.add(component);
    }

    @Override
    public Component getChild(int index){
        return children.get(index);
    }


    
}
