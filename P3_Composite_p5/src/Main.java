package P3_Composite_p5.src;

public class Main {
    public static void main(String[] args) {
        
        Component dept1 = new Department("Department1");

        Component course1 = new Course("Course1", "John", 10);
        Component course2 = new Course("Course2", "Dave", 50);

        dept1.add(course1);
        dept1.add(course2);

        dept1.printData();
    }
    
}
