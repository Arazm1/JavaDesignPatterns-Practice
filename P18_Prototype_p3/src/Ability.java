package P18_Prototype_p3.src;

//SubclassPrototype
// -> Cloneable object used inside the prototype.
public class Ability implements Prototype, Cloneable{

    private String name;
    private int damagePoints;
    private int cooldownSeconds;

    public Ability(String name, int damagePoints, int cooldownSeconds){
        this.name = name;
        this.damagePoints = damagePoints;
        this.cooldownSeconds = cooldownSeconds;
    }


    public Ability clone(){
        try{
            return (Ability) super.clone();


        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException("This should not happen since we implement Cloneable", e);

        }
    }

    @Override
    public String toString(){
        return "Ability name: " + this.name + ", dmg points: " + this.damagePoints + ", cooldown: " + this.cooldownSeconds;
    }
    
}
