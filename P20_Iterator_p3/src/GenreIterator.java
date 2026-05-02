package P20_Iterator_p3.src;

import java.util.Iterator;

public class GenreIterator implements Iterator<Book> {
    private Library library;
    private String genre;
    private int index = 0;

    public GenreIterator(Library library, String genre) {
        this.library = library;
        this.genre = genre;
        advanceToNext();
    }

    private void advanceToNext() {
        while (index < library.getCount() &&
               !library.getBook(index).getGenre().equals(genre)) {
            index++;
        }
    }

    @Override
    public boolean hasNext() {
        return index < library.getCount();
    }

    @Override
    public Book next() {
        Book book = library.getBook(index++);
        advanceToNext();
        return book;
    }
}