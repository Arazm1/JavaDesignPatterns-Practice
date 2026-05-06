package P14_Builder_p8.src;

public class MeatSandwichBuilder implements Builder{

    private Sandwich sandwich;

    public MeatSandwichBuilder(){
        this.sandwich = new Sandwich();
    }

    @Override
    public void buildBread() {
        sandwich.add("BREAAAD");
    }

    @Override
    public void buildFilling() {
        sandwich.add("I DONT KNOW");
    }

    @Override
    public void buildSauce() {
        sandwich.add("STILL DONT KNOW");
    }

    public Sandwich getSandwich(){
        return this.sandwich;
    }
    
    
}
