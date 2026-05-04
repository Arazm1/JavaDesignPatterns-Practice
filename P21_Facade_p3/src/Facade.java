package P21_Facade_p3.src;

public class Facade {
    private ILights lights;
    private IHeating heating;
    private IAlarmSystem alarmSystem;

    public Facade(ILights lights, IHeating heating, IAlarmSystem alarmSystem){
        this.lights = lights;
        this.heating = heating;
        this.alarmSystem = alarmSystem;
    }

    public void arriveHome(){
        System.out.println("Arriving home...");
        lights.on();
        heating.on();
        alarmSystem.deactivate();
        alarmSystem.readLogs();
    }

    public void leaveHome(){
        System.out.println("Leaving home..");
        lights.off();
        heating.off();
        alarmSystem.activate();
    }
    
}
