package P5_Singleton_p5.src;

// Singleton with lazy initialization
class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Piilotettu konstruktori
    }

    public static synchronized Singleton getInstance() {
        // Toteuta lazy initialization: luo instanssi vain jos se ei ole olemassa
        if(instance == null){
            instance =  new Singleton();
        }
        return instance; // placeholder
    }

    public synchronized void performOperation() {
        System.out.println("Singleton performing operation.");
    }
}

// Singleton using enum
enum SingletonEnum {
    INSTANCE;

    public void performOperation() {
        System.out.println("SingletonEnum performing operation.");
    }
}

// Pääohjelma
public class Main {
    public static void main(String[] args) {
        // Lazy singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.performOperation();

        System.out.println(s1 == s2); // pitää tulostaa true

        // Enum singleton
        SingletonEnum.INSTANCE.performOperation();
    }
}
