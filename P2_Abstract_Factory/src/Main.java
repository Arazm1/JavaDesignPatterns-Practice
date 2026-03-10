package P2_Abstract_Factory.src;

import P2_Abstract_Factory.src.Interfaces.GUIFactory;

public class Main {
    public static void main(String[] args) {
        

        GUIFactory factory;

        String os = "windows";

        if(os.equals("windows")){
            factory = new WinFactory();
        }
        else{
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
    
}
