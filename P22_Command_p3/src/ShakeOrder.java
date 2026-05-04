package P22_Command_p3.src;

public class ShakeOrder implements Command{
    private Chef chef;

    public ShakeOrder(Chef chef){
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.pourShake();
    }   
    
}