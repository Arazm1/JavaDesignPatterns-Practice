package P14_Builder_p8.src;

//Director
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildBread();
        builder.buildFilling();
        builder.buildSauce();
    }
    
}
