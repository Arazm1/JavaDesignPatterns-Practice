package P21_Facade_p3.src;

public class Heating implements IHeating{

    @Override
    public void on(){
        System.out.println("Heating turned ON..");
    }
    
    @Override
    public void off(){
        System.out.println("Heating turned OFF..");
    }
}
