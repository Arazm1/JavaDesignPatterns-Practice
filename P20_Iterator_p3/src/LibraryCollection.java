package P20_Iterator_p3.src;

import java.util.Iterator;

//Aggregate Interface
public interface LibraryCollection {
    void add(Book book);

    Iterator<Integer> iterator();
    Iterator<Book> genreIterator(String genre);

    
}
