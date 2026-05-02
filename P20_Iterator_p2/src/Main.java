package P20_Iterator_p2.src;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book("Dune", "Herbert", "Sci-Fi"));
        library.addBook(new Book("1984", "Orwell", "Dystopia"));
        library.addBook(new Book("Foundation", "Asimov", "Sci-Fi"));
        library.addBook(new Book("Brave New World", "Huxley", "Dystopia"));
        library.addBook(new Book("Neuromancer", "Gibson", "Sci-Fi"));

        System.out.println("All Books");
        Iterator all = library.createIterator();
        while (all.hasNext()) {
            Book b = all.next();
            System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getGenre());
        }

        System.out.println("Sci-Fi Books Only");
        Iterator scifi = library.createGenreIterator("Sci-Fi");
        while (scifi.hasNext()) {
            Book b = scifi.next();
            System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getGenre());
        }
    }
}
