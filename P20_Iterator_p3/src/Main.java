package P20_Iterator_p3.src;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.add(new Book("Dune", "Herbert", "Sci-Fi"));
        library.add(new Book("1984", "Orwell", "Dystopia"));
        library.add(new Book("Foundation", "Asimov", "Sci-Fi"));
        library.add(new Book("Brave New World", "Huxley", "Dystopia"));
        library.add(new Book("Neuromancer", "Gibson", "Sci-Fi"));

        // For-each works because Library implements Iterable<Book>
        System.out.println("=== All Books ===");
        for (Book b : library) {
            System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getGenre());
        }

        // Genre iterator used manually
        System.out.println("\n=== Sci-Fi Only ===");
        Iterator<Book> scifi = library.genreIterator("Sci-Fi");
        while (scifi.hasNext()) {
            Book b = scifi.next();
            System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getGenre());
        }
    }
}