package P12_Proxy_p4.src;

public class User {
    private static int userCounter = 0;

    private int userID;
    private String username;

    public User(String username){
        userCounter++;
        this.username = username;
        this.userID = userCounter;
    }

    public int getID(){
        return this.userID;
    }

    public String getUsername(){
        return this.username;
    }

    public static int getTotalUserCount(){
        return userCounter;
    }
    
}
