package P4_Observer_p4.src;

public class Main {
    public static void main(String[] args){

        NewsLetter newsLetter = new NewsLetter("NewsStation1");

        NewsLetterSubscriber newsLetterSubscriber1 = new NewsLetterSubscriber("Subscriber1");
        NewsLetterSubscriber newsLetterSubscriber2 = new NewsLetterSubscriber("Subscriber2");

        newsLetter.subscribe(newsLetterSubscriber1);
        newsLetter.subscribe(newsLetterSubscriber2);

        newsLetter.uploadNewArticle("New Article!");
    }
    
}
