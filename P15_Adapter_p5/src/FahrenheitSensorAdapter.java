package P15_Adapter_p5.src;

//Adapter
public class FahrenheitSensorAdapter implements CelsiusSensor{

    private FahrenheitSensor fahrenheitSensor;

    public FahrenheitSensorAdapter(FahrenheitSensor fahrenheitSensor){
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperatureInCelsius(){
        return (fahrenheitSensor.getTemperatureInFahrenheit() - 32) * 5.0/9;
        
    }
    
}
