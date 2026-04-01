package P1_Factory_Method_p2.src;

// Abstract product
interface Document {
    void open();
    void close();
}

// Concrete products
class TextDocument implements Document {
    // Toteuta tarvittavat metodit
    @Override
    public void open(){
        System.out.println("Opening Text Document..");
    }

    @Override
    public void close(){
        System.out.println("Closing Text Document..");
    }
}

class SpreadsheetDocument implements Document {
    // Toteuta tarvittavat metodit
    @Override
    public void open(){
        System.out.println("Opening Spreadsheet Document..");
    }

    @Override
    public void close(){
        System.out.println("Closing Spreadsheet Document..");
    }
}

// Abstract creator
abstract class Application {
    // Factory Method
    abstract Document createDocument();

    void newDocument() {
        Document doc = createDocument();
        doc.open();
        System.out.println("Document is ready to use.");
    }
}

// Concrete creators
class TextApplication extends Application {
    // Toteuta createDocument
    @Override
    Document createDocument(){
        return new TextDocument();
    }

}

class SpreadsheetApplication extends Application {
    // Toteuta createDocument
    @Override
    Document createDocument(){
        return new SpreadsheetDocument();
    }
}

// Pääohjelma
public class FactoryMethod2 {
    public static void main(String[] args) {
        Application app1 = new TextApplication();
        app1.newDocument();

        Application app2 = new SpreadsheetApplication();
        app2.newDocument();
    }
}