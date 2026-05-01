package P11_Memento_p2.src;

//Caretaker
public class SaveManager {
    private PlayerCharacter player;
    private SaveState quickSlot;

    public SaveManager(PlayerCharacter player){
        this.player = player;
    }

    public void quickSave(){
        quickSlot = player.saveState();
        System.out.println("[SaveManager] Game saved.");
    }

    public void quickLoad(){
        if(quickSlot == null){
            System.out.println("[SaveManager] No save found!");
            return;
        }
        player.restoreState(quickSlot);
        System.out.println("[SaveManager] Game loaded.");
    }
    
}
