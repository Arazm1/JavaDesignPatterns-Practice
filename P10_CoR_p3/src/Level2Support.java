package P10_CoR_p3.src;

import P10_CoR_p3.src.Ticket.TicketType;

public class Level2Support extends Handler{

    //private static final TicketType ticketType = TicketType.LEVEL2;

    @Override
    public void processTicket(Ticket ticket){
        if(ticket.getTicketType() == TicketType.LEVEL2){
            System.out.println("Level 2 support has taken a look into your Ticket.");
        }
        else{
            System.out.println("Level 2 support unable to resolve. Sending the Ticket forward.");
            super.processTicket(ticket);
        }
    }
    
}
