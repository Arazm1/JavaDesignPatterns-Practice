package P22_Command_p4.src;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu(){
        this.menuItems = new ArrayList<>();
    }


    public void add(MenuItem item){
        this.menuItems.add(item);
    }

    public void clickItem(int index){
        if(index >= 0 && index < menuItems.size()){
            menuItems.get(index).clicked();
        }
    }
    
}
