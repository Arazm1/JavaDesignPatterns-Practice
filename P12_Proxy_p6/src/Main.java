package P12_Proxy_p6.src;

public class Main {

    public static void main(String[] args) {
        
        DatabaseService realService = new DatabaseService();

        Service adminProxy = new DatabaseServiceProxy("ADMIN", realService);
        adminProxy.runQuery("SELECT * FROM users");

        Service userProxy = new DatabaseServiceProxy("USER", realService);
        userProxy.runQuery("SELECT * FROM users");
    }
    
}
