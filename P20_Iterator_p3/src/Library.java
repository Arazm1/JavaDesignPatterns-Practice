package P20_Iterator_p3.src;


import java.util.Iterator;

//ConcreteAggregate
public class Library implements Iterable<Book>, LibraryCollection {
    private Book[] books;
    private int count = 0;

    public Library(int size){
        this.books = new Book[size];
    }

    @Override
    public void add(Book book) {
        books[count++] = book;
    }

    public Book getBook(int index) { return books[index]; }
    public int getCount() { return count; }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator(this); //same as Ring returning RingIterator in the example
    }

    @Override
    public Iterator<Book> genreIterator(String genre) {
        return new GenreIterator(this, genre);
    }
    
}
