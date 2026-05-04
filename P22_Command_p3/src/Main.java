package P22_Command_p3.src;

public class Main {
    public static void main(String[] args) {
        
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        Command burger = new BurgerOrder(chef);
        Command shake = new ShakeOrder(chef);



        System.out.println("Table 1 is ordering..");
        waiter.takeOrder(burger);
        waiter.takeOrder(burger);
        waiter.takeOrder(shake);
        waiter.takeOrder(shake);

        System.out.println("Table 1 order taken!");
        System.out.println("Waiter sending order to Chef..");

        waiter.sendOrdersToKitchen();


        System.out.println("Table 2 is ordering...");
        waiter.takeOrder(shake);
        System.out.println("Table 2 order taken!");
        System.out.println("Waiter sending order to Chef..");
        
        waiter.sendOrdersToKitchen();

    }
    
}
