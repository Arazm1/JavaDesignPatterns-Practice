package P21_Facade_p2.src;

public class Main {

    public static void main(String[] args) {
        IDVDPlayer dvdplayer = new DVDPlayer();
        ILights lights = new Lights();
        ISoundSystem soundSystem = new SoundSystem();
        IProjector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdplayer, projector, soundSystem, lights);

        homeTheater.watchMovie("The Covenant");
        System.out.println("Some time later..");
        homeTheater.endMovie();

    }
    
}
