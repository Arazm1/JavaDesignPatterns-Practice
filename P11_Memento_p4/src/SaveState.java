package P11_Memento_p4.src;

//Memento
public class SaveState {
    private int health;
    private int level;

    public SaveState(int health, int level){
        this.health = health;
        this.level = level;
    }

    public int getHealth(){
        return this.health;
    } 

    public int getLevel(){
        return this.level;
    }
    
}
