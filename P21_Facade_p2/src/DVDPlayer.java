package P21_Facade_p2.src;

public class DVDPlayer implements IDVDPlayer{

    @Override
    public void on() {
        System.out.println("Turning DVD Player ON");
    }

    @Override
    public void off() {
        System.out.println("Turning DVD Player OFF");
    }

    @Override
    public void play(String movie) {
        System.out.println("Playing a movie " + movie);
        
    }
    
}