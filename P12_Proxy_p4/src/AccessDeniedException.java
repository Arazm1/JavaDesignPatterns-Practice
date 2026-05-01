package P12_Proxy_p4.src;

public class AccessDeniedException extends Exception{
    public AccessDeniedException(String errorMessage){
        super(errorMessage);
    }
    
}