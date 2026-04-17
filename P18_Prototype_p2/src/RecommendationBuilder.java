package P18_Prototype_p2.src;

public class RecommendationBuilder {
    private Recommendation recommendation;

    public RecommendationBuilder(){
        reset();
    }

    public void reset(){
        recommendation = new Recommendation();
    }

    public void setAudience(String audience){
        recommendation.setTargetAudience(audience);
    }

    public void addBook(String author, String title, int publicationYear){
        recommendation.addItem(new Book(author, title, publicationYear));
    }

    public Recommendation getResult(){
        Recommendation builtRecommendation = recommendation;
        reset();
        return builtRecommendation;
    }
    
}
