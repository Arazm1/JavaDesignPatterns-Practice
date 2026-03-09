package P10_CoR_p3.src;

public class Ticket {

    public enum TicketType{
        LEVEL1,
        LEVEL2,
        LEVEL3,
    }

    private TicketType ticketType;
    private String message;

    public Ticket(String message, TicketType ticketType){
        this.message = message;
        this.ticketType = ticketType;
    }

    public String getMessage(){
        return this.message;
    }

    public TicketType getTicketType(){
        return this.ticketType;
    }
    
}
