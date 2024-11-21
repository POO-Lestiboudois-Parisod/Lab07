package util;

import java.util.NoSuchElementException;

public class It<T> {
    Node<T> current;

    public It(Node<T> start){
        this.current = start;
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T value = current.data;
        current = current.next;
        return value;
    }
}