package P22_Command_p4.src;

public class Main {
    public static void main(String[] args) {
        
        Document document = new Document();

        Command openCommand = new OpenCommand(document);

        MenuItem openMenuItem = new MenuItem(openCommand);

        Menu fileMenu = new Menu();
        fileMenu.add(openMenuItem);

        System.out.println("User clicks the 'Open' menu Item..");
        fileMenu.clickItem(0);

    }
    
}
