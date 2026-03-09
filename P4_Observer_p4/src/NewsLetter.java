package P4_Observer_p4.src;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject{

    private final String name;
    private String articleTitle;
    private final List<Observer> newsLetterObservers;

    public NewsLetter(String name){
        this.name = name;
        this.articleTitle = "";
        this.newsLetterObservers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer){
        this.newsLetterObservers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer){
        this.newsLetterObservers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        this.newsLetterObservers.forEach(subscriber -> subscriber.update(this.articleTitle));
    }

    public void uploadNewArticle(String articleTitle){
        this.articleTitle = articleTitle;
        notifyObservers();
    }

    public String getLatestArticle(){
        return this.articleTitle;
    }
    
}
