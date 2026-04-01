package P14_Builder.src;

public class Main {
    public static void main(String[] args) {
        


        BurgerBuilder cheeseBurger = new CheeseburgerBuilder();
        Director director1 = new Director(cheeseBurger);
        director1.constructSimpleBurger();
        Burger meal = cheeseBurger.getBurger();
        System.out.println(meal);
    }
    
}
