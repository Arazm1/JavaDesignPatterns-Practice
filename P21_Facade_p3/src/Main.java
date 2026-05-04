package P21_Facade_p3.src;

public class Main {
    public static void main(String[] args) {
        
        ILights lights = new Lights();
        IHeating heating = new Heating();
        IAlarmSystem alarmSystem = new AlarmSystem();

        Facade facade = new Facade(lights, heating, alarmSystem);

        facade.arriveHome();
        System.out.println("12hours later..");
        facade.leaveHome();
    }
    
}
