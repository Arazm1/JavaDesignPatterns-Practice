package P4_Observer_v2.src;

public class WeatherListener implements Observer {
    private final String observer;

    public WeatherListener(String observer){
        this.observer = observer;
    }

    @Override
    public void update(double temperature){
        System.out.println(this.observer + " Display -> Temperature updated: " + temperature + "°C");
    }
    
}
