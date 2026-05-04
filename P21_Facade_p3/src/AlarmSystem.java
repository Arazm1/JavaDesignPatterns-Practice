package P21_Facade_p3.src;

public class AlarmSystem implements IAlarmSystem{

    @Override
    public void activate() {
        System.out.println("Alarm System Activated..");
    }

    @Override
    public void deactivate() {
        System.out.println("Alarm System Deactivated..");
    }

    @Override
    public void readLogs() {
        System.out.println("Reading logs");
        System.out.println("Stand by...");
    }
    
}
