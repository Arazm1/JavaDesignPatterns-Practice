package P18_Prototype_p2.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Recommendation> savedLists = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Director director = new Director();
    private static RecommendationBuilder builder = new RecommendationBuilder();

    public static void main(String[] args) {

        director.makeEmptyList(builder);
        savedLists.add(builder.getResult());


        boolean isRunning = true;
        while(isRunning){
            System.out.println("Book Recommendation System");
            System.out.println("1. View existing recommendations");
            System.out.println("2. Clone an existing list");
            System.out.println("3. Create an empty list");
            System.out.println("4. Modify a saved list");
            System.out.println("5. Create a ready-made recommendation list");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String userChoice = scanner.nextLine();

            switch(userChoice){
                case "1" -> viewSavedList();

                case "2" -> cloneList();

                case "3" -> createEmptyList();

                case "4" -> modifyList();

                case "5" -> createBasicGenreList();

                default -> {
                    System.out.println("Unknown choice.");
                }
            }
        }
    }

    /**
     * View currently saved recommendation list within savedList
     */
    private static void viewSavedList(){
        System.out.println("\nViewing saved Recommendations:");
        for(int i = 0; i< savedLists.size(); i++){
            Recommendation recommendation = savedLists.get(i);
            System.out.println((i + 1) + ". Target Audience: " + recommendation.getTargetAudience());
            System.out.println("   Books: " + recommendation.getItems().size());
        }
        System.out.println();
    }

    private static void cloneList(){
        int index = choiceAndVerify("clone");

        if(index == -1){
            return;
        }

        Recommendation clonedRecommendation = savedLists.get(index).clone();
        
        System.out.print("Enter the Target Audience for the new cloned recommendation list: ");
        String newAudience = scanner.nextLine();
        clonedRecommendation.setTargetAudience(newAudience);

        savedLists.add(clonedRecommendation);

        System.out.println("Clone List Operation successful! \n");
    }


    private static void createEmptyList(){

        Recommendation clonedRecommendation = savedLists.get(0).clone();
        System.out.print("\nEnter the Target Audience for the new empty recommendation list: ");
        String newAudience = scanner.nextLine();
        clonedRecommendation.setTargetAudience(newAudience);

        savedLists.add(clonedRecommendation);

        System.out.println("Clone List Operation successful! \n");
    }



    private static void modifyList(){
        int index = choiceAndVerify("modify");

        if(index == -1){
            return;
        }

        Recommendation recToModify = savedLists.get(index);
        
        System.out.println("\nModifying the list (ID: ): " + recToModify.getTargetAudience());
        modifyListMenu();

        int userMenuChoice = Integer.parseInt(scanner.nextLine());

        switch (userMenuChoice) {
            case 1 -> {
                System.out.println("Enter new target audience name: ");
                String newTargetAudience = scanner.nextLine();
                recToModify.setTargetAudience(newTargetAudience);
                System.out.println("Target audience updated to: " + newTargetAudience + "!\n");
            }
            case 2 -> {
                System.out.println("Adding a new book to list..");
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter Book title: ");
                String bookTitle = scanner.nextLine();
                System.out.println("Available genres: FANTASY, SCIENCE_FICTION, HISTORICAL, MYSTERY, FICTION");
                System.out.print("Enter the genre: ");
                String genreInput = scanner.nextLine();

                try{
                    Genre genre = Genre.valueOf(genreInput);
                    recToModify.addItem(new Book(author, bookTitle, genre));
                    System.out.println("Book added successfully!\n");
                }
                catch(IllegalArgumentException e){
                    System.out.println("Invalid genre entered.\n");
                }
                catch(Error e){
                    e.printStackTrace();
                }
            }
            case 3 -> {
                System.out.println("Removing a book: ");
                List<Item> books = recToModify.getItems();
                if(books.isEmpty()){
                    System.out.println("No books in this recommendation list!\n");
                    return;
                }

                for(int i = 0; i<books.size(); i++){
                    System.out.println("ID:" + (i + 1) + ": " + books.get(i).toString());
                }

                System.out.println("Enter the ID of the book to remove");
                int userIDInput = Integer.parseInt(scanner.nextLine());
                int indexID = userIDInput - 1;
                
                if(indexID < 0 || indexID>books.size()){
                    System.out.println("ID out of bounds!\n");
                    return;
                }

                books.remove(indexID);
                System.out.println("Book removed successfully!\n");
            }

            case 4 -> {
                System.out.println("Returning back to the main menu\n");
                break;
            }
        
            default ->{
                System.out.println("Invalid choice! Returning back to the main menu.\n");
                break;
            }
                
        }
    }

    private static void createBasicGenreList(){
        System.out.println("\nGenerating a genre-based recommendation list...");
        basicGenreMenu();
        int userChoice = Integer.parseInt(scanner.nextLine());

        if(userChoice<=0 || userChoice>5){
            System.out.println("Choice of ouf bounds");
            return;
        }

        switch (userChoice) {
            case 1 -> {
                System.out.println("Creating a basic fantasy recommendation list...");
                director.makeBasicFantasyList(builder);
                savedLists.add(builder.getResult());
                System.out.println("Generated!\n");
            }

            case 2 -> {
                System.out.println("Creating a basic sci-fi recommendation list...");
                director.makeBasicSciFiList(builder);
                savedLists.add(builder.getResult());
                System.out.println("Generated!\n");
            }

            case 3 -> {
                System.out.println("Creating a basic history recommendation list...");
                director.makeBasicHistoricalList(builder);
                savedLists.add(builder.getResult());
                System.out.println("Generated!\n");
            }

            case 4 -> {
                System.out.println("Creating a basic mystery recommendation list...");
                director.makeBasicMysteryList(builder);
                savedLists.add(builder.getResult());
                System.out.println("Generated!\n");
            }

            case 5 -> {
                System.out.println("Creating a basic fiction recommendation list...");
                director.makeBasicFictionList(builder);
                savedLists.add(builder.getResult());
                System.out.println("Generated!\n");
            }
            default -> {
                System.out.println("Invalid choice.");
            }
        }


    }


    private static int choiceAndVerify(String operation) {
    viewSavedList();
    System.out.print("\nEnter the number of the list you wish to " + operation + ": ");
    
    try {
        int userInput = Integer.parseInt(scanner.nextLine());
        int index = userInput - 1;

        if (index < 0 || index >= savedLists.size()) {
            System.out.println("Error! Selection must be within the bounds of the list.");
            return -1;
        }
        
        return index;

    } catch (NumberFormatException e) {
        System.out.println("Error! Please enter a valid number.");
        return -1;
    }
}

    private static void modifyListMenu(){
        System.out.println("\n1. Change target audience");
        System.out.println("2. Add a new book");
        System.out.println("3. Remove a book");
        System.out.println("4. Return to main menu");
        System.out.print("Enter your choice: ");
    }

    private static void basicGenreMenu() {
        System.out.println("\n1. Create a basic fantasy recommendation list");
        System.out.println("2. Create a basic sci-fi recommendation list");
        System.out.println("3. Create a basic history recommendation list");
        System.out.println("4. Create a basic mystery recommendation list");
        System.out.println("5. Create a basic fiction recommendation list");
        System.out.print("Enter your choice: ");
    }
    
}
