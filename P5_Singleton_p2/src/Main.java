package P5_Singleton_p2.src;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFilename("File1.txt");
        logger.write("Hi. First Line");
        logger.write("Bye. Second Line");
        
    }
    
}
