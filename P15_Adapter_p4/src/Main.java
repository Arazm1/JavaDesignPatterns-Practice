package P15_Adapter_p4.src;

//Client
public class Main {
    public static void main(String[] args) {
        
        WeatherMonitor newWeatherMonitor = new WeatherStationAdapter(new WeatherStation(98.6, 65.0, 12.4));
        newWeatherMonitor.printWeatherReport();

        System.out.println();
        System.out.println("Changing temperature to 25 Celsius degree..");
        newWeatherMonitor.setTemperatureCelsius(25);
        newWeatherMonitor.printWeatherReport();


    }
    
}
