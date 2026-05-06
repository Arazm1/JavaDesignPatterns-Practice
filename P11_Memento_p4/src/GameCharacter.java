package P11_Memento_p4.src;


//Originator
public class GameCharacter {
    private int health;
    private int level;

    public GameCharacter(){
        this.health = 100;
        this.level = 1;
    }

    public void takeDamage(int amount){
        this.health -= amount;
    }

    public void levelUp(){
        this.level ++;
    }

    public SaveState save(){
        return new SaveState(this.health, this.level);
    }

    public void restore(SaveState m){
        if(m != null){
            this.health = m.getHealth();
            this.level = m.getLevel();
        }

    }

    public void printStats(){
        System.out.println("Current Health: " + this.health);
        System.out.println("Current level: " + this.level);
    }
    
}
