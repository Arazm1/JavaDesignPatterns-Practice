package P15_Adapter_p4.src;

//"Legacy Service"
//(Given to you, do not modify)
public class WeatherStation {
    private double temperatureFahrenheit;
    private double humidityPercent;
    private double windSpeedMph;

    public WeatherStation(double tempF, double humidity, double windMph) {
        this.temperatureFahrenheit = tempF;
        this.humidityPercent = humidity;
        this.windSpeedMph = windMph;
    }

    public double getTemperatureFahrenheit() { return temperatureFahrenheit; }
    public double getHumidityPercent() { return humidityPercent; }
    public double getWindSpeedMph() { return windSpeedMph; }
    public void setTemperatureFahrenheit(double temp) { this.temperatureFahrenheit = temp; }
}