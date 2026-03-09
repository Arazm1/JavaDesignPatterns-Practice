package P10_CoR_p3.src;

import P10_CoR_p3.src.Ticket.TicketType;

public class Level1Support extends Handler {

    private static final TicketType ticketType = TicketType.LEVEL1;

    @Override
    public void processTicket(Ticket ticket){
        if(ticket.getTicketType() == ticketType){
            System.out.println("Level 1 support has taken a look into your Ticket.");
        }
        else{
            System.out.println("Level 1 support unable to resolve. Sending the Ticket forward.");
            super.processTicket(ticket);
        }
    }
    
}
