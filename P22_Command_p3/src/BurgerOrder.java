package P22_Command_p3.src;

public class BurgerOrder implements Command{
    private Chef chef;


    public BurgerOrder(Chef chef){
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookBurger();
    }

}
