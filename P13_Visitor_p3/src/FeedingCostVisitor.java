package P13_Visitor_p3.src;

public class FeedingCostVisitor implements Visitor {

    @Override
    public void visit(Lion lion) {
        System.out.println(lion.getWeightKg() * 3.5 + "e");
    }

    @Override
    public void visit(Penguin penguin) {
        System.out.println(penguin.getWeightKg() * 1.2 + "e");
    }

    @Override
    public void visit(Snake snake) {
        System.out.println(snake.getWeightKg() * 0.8 + "e");
    }
    
}
