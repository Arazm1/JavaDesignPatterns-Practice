package P5_Singleton_p4.src;

public class Main {
    public static void main(String[] args){

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started..");
        logger2.log("User clicked a button");

        System.out.println(logger1 == logger2);
    }
    
}
