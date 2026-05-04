package P22_Command_p4.src;

//Receiver
public class Document {

    public void open(){
        System.out.println("Opening the Document..");
    }

    public void close(){
        System.out.println("Closing the Document..");
    }
    
    public void cut(){
        System.out.println("Document Cut!");
    }

    public void copy(){
        System.out.println("Document Copied!");
    }

    public void paste(){
        System.out.println("Document Pasted!");
    }
    
}
