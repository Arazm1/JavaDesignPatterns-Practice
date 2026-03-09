package P4_Observer_p4.src;

public class NewsLetterSubscriber implements Observer {
    private String name;

    NewsLetterSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String articleTitle){
        System.out.println("Email sent to: " + this.name + ": New Article: " + articleTitle);
    }
    
}
