package P20_Iterator_p2.src;

public class LibraryIterator implements Iterator {
    private Library library;
    private int index = 0;

    public LibraryIterator(Library library){
        this.library = library;
    }


    @Override
    public boolean hasNext(){
        return this.index < library.getCount();
    }

    @Override
    public Book next(){
        return this.library.getBook(index++);
    }
    
}
