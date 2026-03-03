package P7_State_p2.src;

import java.util.Random;
import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private final String defaultNames[] = {"John", "Steve", "Alex", "Jane"};
    private State state;

    //Character attributes
    private String name;
    private levelType level;
    private double xpPoints;
    private double healthPoints;

    public enum levelType{
        Novice,
        Intermediate,
        Expert,
        Master
    }


    public Character(){
        state = new SetupState(this);
        //Init values
        setLevel(levelType.Novice);
        setXPPoints(0);
        setHealthPoints(100);
    }

    public void operate(){
        while(true){
            if(this.state == null){
                System.out.println("Character dead..too bad");
                return;
            }

            state.action();
        }
    }

    public void setState(State state){
        this.state = state;
    }


    public int readUserChoice(String[] options){
        System.out.println("\nSelect an option: ");
        for(int i=1; i<=options.length; i++){
            System.out.println(i + ". " + options[i-1]);
        }

        return scanner.nextInt();
    }



    //Character
    public void askName(){
        System.out.println("Enter a username or computer will pick a default name for you: ");
        String name = scanner.nextLine();
        if(name.trim().isEmpty()){
            name = defaultNames[random.nextInt(defaultNames.length)];
        }
        setName(name);
        System.out.println(name + " chosen as the name of the character.");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLevel(levelType level){
        this.level = level;
    }

    public void setXPPoints(double xpPoints){
        this.xpPoints = xpPoints;
    }

    public void setHealthPoints(double healthPoints){
        this.healthPoints = healthPoints;
    }


    public String getName(){
        return this.name;
    }

    public levelType getLevel(){
        return this.level;
    }

    public double getXPPoints(){
        return this.xpPoints;
    }

    public double getHealthPoints(){
        return this.healthPoints;
    }

    
}
