package P21_Facade.src;

public class HomeSecuritySystem implements SecuritySystem{

    @Override
    public void activate(){
        System.out.println("Security system activated!");
    }

    @Override
    public void deactivate(){
        System.out.println("Security system deactivated!");
    }

    public void readLog(){
        System.out.println("Reading security log...");
        System.out.println("Log: Security check completed, no issues found.");
    }
    
}
