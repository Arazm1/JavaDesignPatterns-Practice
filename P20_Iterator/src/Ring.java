package P20_Iterator.src;

import java.util.Iterator;

public class Ring implements Iterable<Integer>, SimpleCollection{
    private Node head;
    private Node tail;

    public Ring(){
        this.head = null;
        this.tail = null;
    }

    public void add(Integer data){
        Node newNode = new Node(data);
        //First element
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
    }

    public Node getHead(){
        return this.head;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new RingIterator(this);
    }
    
}
