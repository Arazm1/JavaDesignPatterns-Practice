package P22_Command_p2.src;

//Receiver
public class Rover {
    private int x = 0;
    private int y = 0;


    public void moveUp(){
        y++;
        printPosition();
    }

    public void moveDown() {
        y--;
        printPosition();
    }

    public void moveRight(){
        x++;
        printPosition();
    }

    public void moveLeft() {
        x--;
        printPosition();
    }


    private void printPosition() {
        System.out.println("Rover is now at (X: " + x + ", Y: " + y + ")");
    }
    
}
