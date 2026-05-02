package P15_Adapter_p4.src;

//Adapter
public class WeatherStationAdapter implements WeatherMonitor{

    private WeatherStation weatherStation;

    public WeatherStationAdapter(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public double getTemperatureCelsius() {
        return ((weatherStation.getTemperatureFahrenheit() - 32) * 5.0/9);
    }

    @Override
    public double getHumidityPercent() {
        return weatherStation.getHumidityPercent();
    }

    @Override
    public double getWindSpeedKmh() {
        return (weatherStation.getWindSpeedMph() * 1.609);
    }

    @Override
    public void setTemperatureCelsius(double celsius) {
        weatherStation.setTemperatureFahrenheit((celsius * 9/5) +32);
    }

    @Override
    public void printWeatherReport() {
        System.out.println("Weather Report:");
        System.out.println("Temperature: " + getTemperatureCelsius());
        System.out.println("Humidity: " + getHumidityPercent());
        System.out.println("Wind speed: " + getWindSpeedKmh());
    }
    
}
