package P21_Facade_p2.src;

//Facade 
public class HomeTheaterFacade {
    private IDVDPlayer dvdplayer;
    private IProjector projector;
    private ISoundSystem soundSystem;
    private ILights lights;


    public HomeTheaterFacade(IDVDPlayer dvdplayer, IProjector projector, ISoundSystem soundSystem, ILights lights){
        this.dvdplayer = dvdplayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movieName){
        System.out.println("Going to watch a Movie..");
        lights.dim(5);
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(30);
        dvdplayer.on();
        dvdplayer.play(movieName);
    }

    public void endMovie(){
        dvdplayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
    
}
