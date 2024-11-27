/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package util;

import java.util.NoSuchElementException;

public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    public void clear() {
        head = null;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T value = head.data;
        head = head.next;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        String result = "";
        Node<T> current = head;
        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += " ";
            }
            current = current.next;
        }
        return result;
    }

    public Object[] toArray() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        Object[] array = new Object[size];
        current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    public It<T> iterator() {
        return new It<>(head);
    }

}

