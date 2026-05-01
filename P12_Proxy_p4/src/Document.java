package P12_Proxy_p4.src;

import java.time.LocalDate;

public interface Document {
    int getID();
    LocalDate getDate();
    String getContent(User user) throws AccessDeniedException;
    
}
