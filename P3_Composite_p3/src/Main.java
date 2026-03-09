package P3_Composite_p3.src;

public class Main {
    public static void main(String[] args){

        Component squad1 = new MilitaryUnit("Squad1");
        Component squad2 = new MilitaryUnit("Squad2");
        Component platoon = new MilitaryUnit("Platoon");

        Component squadLeader = new Soldier("Name1", "Sergeant");
        Component squadLeader2 = new Soldier("Name6", "Sergeant");
        Component private1 = new Soldier("Name2", "Private");
        Component private2 = new Soldier("Name3", "Private");
        Component private3 = new Soldier("Name4", "Private");
        Component private4 = new Soldier("Name5", "Private");

        squad1.add(squadLeader);
        squad1.add(private1);
        squad1.add(private2);

        squad2.add(squadLeader2);
        squad2.add(private3);
        squad2.add(private4);

        platoon.add(squad1);
        platoon.add(squad2);

        platoon.printData();

        
    }
    
}
