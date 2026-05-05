package P15_Adapter_p5.src;

public class Main {
    public static void main(String[] args) {
        FahrenheitSensor legacy = new FahrenheitSensor();
        CelsiusSensor sensor = new FahrenheitSensorAdapter(legacy);
        System.out.println(sensor.getTemperatureInCelsius());
    }
    
}
