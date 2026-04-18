package P19_Mediator.src;

public abstract class Aircraft {
    private ATC tower;

    private static int count = 0;
    private int id;
    private Intention intention;

    public Aircraft(Intention intention, ATC tower){
        this.id = ++count;
        this.intention = intention;
        this.tower = tower;

        tower.requestRunway(this);
    }

    public Intention getIntention(){
        return this.intention;
    }

    public void clearForTakeoff(Runway runway){
        System.out.println(this + " receives takeoff clearance, " + runway);
        tower.acknowledge("Roger taking off from " + runway);
    }

    public void clearForLanding(Runway runway) {
        System.out.println(this + " receives landing clearance, " + runway);
        tower.acknowledge("Roger landing on " + runway);
    }

    public void holdPosition(Runway runway) {
        System.out.println(this + " receives request to hold position on " + runway);
        tower.acknowledge("Roger holding position on " + runway);
    }

    public String toString(){
        return getClass().getSimpleName() + " " + this.id + " (" + intention + ")";
    }


    
}
