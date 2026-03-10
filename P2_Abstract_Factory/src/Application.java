package P2_Abstract_Factory.src;

import P2_Abstract_Factory.src.Interfaces.Button;
import P2_Abstract_Factory.src.Interfaces.Checkbox;
import P2_Abstract_Factory.src.Interfaces.GUIFactory;

public class Application {
    
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paintAll(){
        button.paint();
        checkbox.paint();
    }
    
}
