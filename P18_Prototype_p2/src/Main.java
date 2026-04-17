package P18_Prototype_p2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        Director director = new Director();
        RecommendationBuilder builder = new RecommendationBuilder();
        
        
        director.makeClassicSciFiList(builder);
        Recommendation recommendation = builder.getResult();

        System.out.println(recommendation);


        boolean isRunning = true;
        while(isRunning){
            System.out.println("Book Recommendation System");
            System.out.println("1. View existing recommendations");
            System.out.println("2. Clone and modify a recommendation");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String userChoice = scanner.nextLine();

            switch(userChoice){
                case "1" -> System.out.println("View recommendations..");

                case "2" -> System.out.println("Clone or modify");

                case "3" -> System.out.println("Turning off..");

                default -> {
                    System.out.println("Unknown choice.");
                }
            }
        }
    }
    
}
