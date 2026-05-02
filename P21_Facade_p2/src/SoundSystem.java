package P21_Facade_p2.src;

public class SoundSystem implements ISoundSystem{

    @Override
    public void on() {
        System.out.println("Sound System ON");
    }

    @Override
    public void off() {
        System.out.println("Sound System OFF");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }
    
}
