package P18_Prototype_p2.src;

public class Director {

    public void makeClassicSciFiList(RecommendationBuilder builder) {
        builder.reset();
        builder.setAudience("Classic Sci-Fi Fans");
        builder.addBook("Frank Herbert", "Dune", 1965);
        builder.addBook("Isaac Asimov", "Foundation", 1951);
        builder.addBook("Arthur C. Clarke", "2001: A Space Odyssey", 1968);
    }

    public void makeHighFantasyList(RecommendationBuilder builder) {
        builder.reset();
        builder.setAudience("High Fantasy Lovers");
        builder.addBook("J.R.R. Tolkien", "The Hobbit", 1937);
        builder.addBook("C.S. Lewis", "The Lion, the Witch and the Wardrobe", 1950);
    }
    
}
