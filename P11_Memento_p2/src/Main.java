package P11_Memento_p2.src;

public class Main {
    public static void main(String[] args) {
        
        PlayerCharacter player = new PlayerCharacter(100, 1, "Starting Village");
        SaveManager manager = new SaveManager(player);

        player.printStatus();
        
        player.levelUp();
        player.travelTo("Dark Forest");
        player.printStatus();

        manager.quickSave();

        player.takeDamage(115);
        player.printStatus();

        manager.quickLoad();
        player.printStatus();


    }
    
}
