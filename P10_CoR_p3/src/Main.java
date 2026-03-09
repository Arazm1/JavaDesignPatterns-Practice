package P10_CoR_p3.src;

import P10_CoR_p3.src.Ticket.TicketType;

public class Main {
    public static void main(String[] args) {
        
        Handler supportHandler;

        Handler handleLevel1 = new Level1Support();
        Handler handleLevel2 = new Level2Support();
        Handler handleLevel3 = new Level3Support();

        handleLevel1.setNextHandler(handleLevel2);
        handleLevel2.setNextHandler(handleLevel3);
        supportHandler = handleLevel1;

        Ticket ticket = new Ticket("PC dont turn on", TicketType.LEVEL3);
        supportHandler.processTicket(ticket);

    }
    
}
