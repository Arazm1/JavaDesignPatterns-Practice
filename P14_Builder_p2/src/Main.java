package P14_Builder_p2.src;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingPCBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingPCBuilder);
        director1.constructComputer();
        Computer computer1 = gamingPCBuilder.getComputer();
        System.out.println(computer1);

    }
    
}
