package P13_Visitor_p5.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Cat("Cattt", 10000));
        animals.add(new Dog("DOG", 20));

        VetVisitor vetVisitor = new VetVisitor();
        for(IAnimal animal : animals){
            animal.accept(vetVisitor);
        }
    }
    
}
