package util;

public class Liste<T> {
    Node<T> head;

    public Liste() {
        this.head = null;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public It<T> iterator() {
        return new It<>(head);
    }
}
