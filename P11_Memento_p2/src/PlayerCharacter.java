package P11_Memento_p2.src;

//Originator
public class PlayerCharacter {
    private int health;
    private int level;
    private String currentZone;


    public PlayerCharacter(int health, int level, String currentZone) {
        this.health = health;
        this.level = level;
        this.currentZone = currentZone;
    }

    public void takeDamage(int amount){
        this.health -= amount;
    }

    public void levelUp(){
        this.level += 1;
        this.health += 20;
    }

    public void travelTo(String zone){
        this.currentZone = zone;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setCurrentZone(String zone){
        this.currentZone = zone;
    }

    public void restoreState(SaveState state){
        state.applyTo(this);
    }

    public SaveState saveState(){
        return new GameSave(health, level, currentZone);
    }

    public void printStatus() {
        System.out.println("Level: " + level + " | Health: " + health + " | Zone: " + currentZone);
    }
    
}
