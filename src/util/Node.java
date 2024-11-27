/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package util;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
