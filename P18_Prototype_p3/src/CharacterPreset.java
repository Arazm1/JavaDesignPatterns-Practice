package P18_Prototype_p3.src;

import java.util.ArrayList;
import java.util.List;

//ConcretePrototype
// -> Main class that implements deep cloning.
public class CharacterPreset implements Prototype, Cloneable{

    private String className;
    private int baseHealth;
    private int baseAttack;
    private String faction;

    private List<Ability> abilities;

    public CharacterPreset(){
        this.abilities = new ArrayList<>();
    }

    

    public List<Ability> getAbilities(){
        return this.abilities;
    }

    public void addAbility(Ability ability){
        this.abilities.add(ability);
    }

    public void removeAbility(Ability ability){
        this.abilities.remove(ability);
    }


    @Override
    public CharacterPreset clone(){
        try{
            CharacterPreset clonedCharacterPreset = (CharacterPreset) super.clone();
            clonedCharacterPreset.abilities = new ArrayList<>();
            //deep copy
            for(Ability ability : this.abilities){
                clonedCharacterPreset.addAbility(ability.clone());
            }
            return clonedCharacterPreset;

        }
        catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        return "CharacterPreset with abilities: \n" + this.abilities;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void setBaseHealth(int baseHealth){
        this.baseHealth = baseHealth;
    }

    public void setBaseAttack(int baseAttack){
        this.baseAttack = baseAttack;
    }

    public void setFaction(String faction){
        this.faction = faction;
    }

    public String getFaction(){
        return this.faction;
    }
    
}
