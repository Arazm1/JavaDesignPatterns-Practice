package P13_Visitor_p3.src;

public class HealthReportVisitor implements Visitor{

    @Override
    public void visit(Lion lion) {
        if(lion.getManeLength() < 20){
            System.out.println("Lion is healthy");
        }
        else{
            System.out.println("Lion needs attention");
        }
    }

    @Override
    public void visit(Penguin penguin) {
        if(penguin.getSwimSpeedKmh() > 15){
            System.out.println("Penguin is healthy.");
        }
        else{
            System.out.println("Penguin needs attention.");
        }
    }

    @Override
    public void visit(Snake snake) {
        if(snake.getLengthM() > 1.5){
            System.out.println("Snake is healthy");
        }
        else{
            System.out.println("Juvenile");
        }
    }

    
    
}
