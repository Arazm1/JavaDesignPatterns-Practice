package P21_Facade_p3.src;

public class Lights implements ILights {

    @Override
    public void on(){
        System.out.println("Turning lights ON..");
    }

    @Override
    public void off(){
        System.out.println("Turning lights OFF..");
    }

    @Override
    public void setLevel(int level) {
        System.out.println("Lights set to level: " + level);
    }
    
}
