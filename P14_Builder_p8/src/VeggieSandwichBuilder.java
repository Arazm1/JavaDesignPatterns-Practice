package P14_Builder_p8.src;

//ConcreteBuilder
public class VeggieSandwichBuilder implements Builder{

    private Sandwich sandwich;

    public VeggieSandwichBuilder(){
        this.sandwich = new Sandwich();
    }

    @Override
    public void buildBread() {
        sandwich.add("JOKU LEIPÄ");
    }

    @Override
    public void buildFilling() {
        sandwich.add("Something IN THE MIDDLE");
    }

    @Override
    public void buildSauce() {
        sandwich.add("WHO EVEN PUTS SAUCE");
    }

    public Sandwich getSandwich(){
        return this.sandwich;
    }
    
}
