package P18_Prototype.Advanced.src;

public class WearableItem extends Item implements Cloneable {
    public WearableItem(String name){
        super(name);
    }

    @Override
    public WearableItem clone(){
        return (WearableItem) super.clone();
    }
    
}
