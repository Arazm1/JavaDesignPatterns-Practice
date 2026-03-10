package P2_Abstract_Factory.src;

import P2_Abstract_Factory.src.Interfaces.Button;
import P2_Abstract_Factory.src.Interfaces.Checkbox;
import P2_Abstract_Factory.src.Interfaces.GUIFactory;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }

    
    
}
