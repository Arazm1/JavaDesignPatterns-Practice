package P13_Visitor_p3.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Lion("Lion1", 20, 19));
        animals.add(new Lion("Penguin1", 30, 29));
        animals.add(new Lion("Snake1", 10, 1));

        FeedingCostVisitor feedingCostVisitor = new FeedingCostVisitor();
        for(IAnimal animal :  animals){
            animal.accept(feedingCostVisitor);
        }

        HealthReportVisitor healthReportVisitor = new HealthReportVisitor();
        for(IAnimal animal : animals){
            animal.accept(healthReportVisitor);
        }

        


    }
    
}
