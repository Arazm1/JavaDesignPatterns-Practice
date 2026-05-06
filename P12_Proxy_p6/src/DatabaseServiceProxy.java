package P12_Proxy_p6.src;


public class DatabaseServiceProxy implements Service{

    private DatabaseService databaseService;
    private String role;

    public DatabaseServiceProxy(String role, DatabaseService databaseService) {
        this.role = role.toUpperCase();
        this.databaseService = databaseService;
    }

    public void setRole(String role){
        this.role = role.toUpperCase();
    }

    @Override
    public void runQuery(String query) {
        if(databaseService != null){
            if(this.role.equals("ADMIN")){
                System.out.println("Running database query: " + query);
            }
            else{
                System.out.println("No permissions to run query with the role: " + this.role);
            }       
        }
        else{
            System.out.println("No DatabaseService.");    
        }
    }
}