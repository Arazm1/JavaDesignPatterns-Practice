package P11_Memento_p4.src;

import java.util.Stack;

//Caretaker
public class SaveManager {

    private Stack<SaveState> savedStates;

    public SaveManager(){
        this.savedStates = new Stack<>();
    }

    public void saveGame(SaveState m){
        this.savedStates.push(m);
    }

    public SaveState loadLastSave(){
        SaveState lastSave = this.savedStates.pop();
        return lastSave;

    }
    
}
