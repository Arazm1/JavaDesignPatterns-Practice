package P11_Memento_p2.src;

//Memento
class GameSave implements SaveState{
    final int health;
    final int level;
    final String currentZone;

    GameSave(int health, int level, String currentZone){
        this.health = health;
        this.level = level;
        this.currentZone = currentZone;
    }

    @Override
    public void applyTo(PlayerCharacter player){
        player.setHealth(health);
        player.setLevel(level);
        player.setCurrentZone(currentZone);
    }
    
}
