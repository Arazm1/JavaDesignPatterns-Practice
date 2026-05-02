package P15_Adapter_p4.src;

//Client Interface
public interface WeatherMonitor {
    double getTemperatureCelsius();
    double getHumidityPercent();
    double getWindSpeedKmh();
    void setTemperatureCelsius(double celsius);
    void printWeatherReport();
    
}
