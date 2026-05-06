package P11_Memento_p4.src;

//Client
public class Main {
    public static void main(String[] args) {
        
        GameCharacter gameCharacter = new GameCharacter();
        SaveManager saveManager = new SaveManager();

        gameCharacter.printStats();
        gameCharacter.takeDamage(5);
        gameCharacter.printStats();

        saveManager.saveGame(gameCharacter.save());

        gameCharacter.takeDamage(50);
        gameCharacter.printStats();
        saveManager.saveGame(gameCharacter.save());


        gameCharacter.takeDamage(100);
        gameCharacter.printStats();
        gameCharacter.restore(saveManager.loadLastSave());

        gameCharacter.printStats();

        gameCharacter.restore(saveManager.loadLastSave());
        gameCharacter.printStats();


    }
    
}
