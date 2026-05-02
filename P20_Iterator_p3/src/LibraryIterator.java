package P20_Iterator_p3.src;

import java.util.Iterator;

//ConcreteIterator
public class LibraryIterator implements Iterator<Book>{
    private Library library;
    private int index = 0;

    public LibraryIterator(Library library){
        this.library = library;
    }

    @Override
    public boolean hasNext() {
        return index < library.getCount();
    }

    @Override
    public Book next() {
        return library.getBook(index++);
    }
    
}
