package P20_Iterator_p2.src;

import java.util.ArrayList;
import java.util.List;

//ConcreteAggregate
public class Library implements Iterable{

    private Book[] books;
    private int count = 0;


    public Library(int size){
        this.books = new Book[size];
    }


    public void addBook(Book book){
        books[count] = book;
        count ++;
    }

    public int getCount(){
        return this.count;
    }

    public Book getBook(int index){
        return this.books[index];
    }

    @Override
    public Iterator createIterator(){
        return new LibraryIterator(this);
    }

    public Iterator createGenreIterator(String genre) {
        return new GenreIterator(this, genre);
    }
    
}
