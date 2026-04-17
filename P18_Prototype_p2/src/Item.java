package P18_Prototype_p2.src;

public abstract class Item implements Cloneable{
    private String author;
    private String title;
    private int publicationYear;

    public Item(String author, String title, int publicationYear){
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public Item clone(){
        try{
            return (Item) super.clone();

        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException("This should not happen since we implement Cloneable", e);
        }
    }

    @Override
    public String toString(){
        return "author: " + this.author + "\n" +
                "title: " + this.title + "\n" +
                "publicationyear: " + this.publicationYear;


    }
    
}
