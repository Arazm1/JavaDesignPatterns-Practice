package P18_Prototype_p3.src;

public class Main {
    public static void main(String[] args) {
        
        //Warrior
        Ability shieldBash = new Ability("Shield Bash", 40, 5);
        Ability battlecry = new Ability("Battlecry", 0, 30);

        CharacterPreset warrior = new CharacterPreset();
        warrior.setClassName("Warrior");
        warrior.setBaseHealth(200);
        warrior.setBaseAttack(85);
        warrior.setFaction("Alliance");
        warrior.addAbility(shieldBash);
        warrior.addAbility(battlecry);


        //Wizard
        Ability fireball = new Ability("Fireball", 120, 8);
        Ability blink = new Ability("Blink", 0, 15);

        CharacterPreset wizard = new CharacterPreset();
        wizard.setClassName("Wizard");
        wizard.setBaseHealth(120);
        wizard.setBaseAttack(140);
        wizard.setFaction("Alliance");
        wizard.addAbility(fireball);
        wizard.addAbility(blink);


        //Originals
        System.out.println("Original Presets");
        System.out.println(warrior);
        System.out.println(wizard + "\n");


        //Clone Warrior and modify
        CharacterPreset darkWarrior = warrior.clone();
        darkWarrior.setClassName("Dark Warrior");
        darkWarrior.setFaction("Horde");
        darkWarrior.setBaseAttack(100);
        darkWarrior.addAbility(new Ability("Shadow Strike", 60, 10));

        System.out.println("DarkWarrior");
        System.out.println(darkWarrior);



        System.out.println("=== Proving Deep Copy ===");
        System.out.println("Original Warrior ability count : " + warrior.getAbilities().size());
        System.out.println("Dark Warrior ability count     : " + darkWarrior.getAbilities().size());
        System.out.println("Original Warrior faction       : " + warrior.getFaction());
        System.out.println("Dark Warrior faction           : " + darkWarrior.getFaction());

    }
    
}
