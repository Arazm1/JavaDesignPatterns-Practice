package P10_CoR_p3.src;

public abstract class Handler {

    private Handler nextHandler;

    public void processTicket(Ticket ticketMessage){
        if(nextHandler != null){
            nextHandler.processTicket(ticketMessage);
        }
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    
}
