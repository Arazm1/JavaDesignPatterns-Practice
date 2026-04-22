package P20_Iterator.src;

import java.util.Iterator;

public interface SimpleCollection {
    void add(Integer element);

    Iterator<Integer> iterator();
    
}
