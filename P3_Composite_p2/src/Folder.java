package P3_Composite_p2.src;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    private List<Component> children = new ArrayList<>();

    public Folder(String name){
        super(name);
    }

    @Override
    public void printData(){
        super.printData();
        for(Component child : this.children){
            System.out.print("  ");
            child.printData();
        }
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
    
}
