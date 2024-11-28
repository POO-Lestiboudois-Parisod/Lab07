/**
 * Classe Node représentant un nœud d'une liste chaînée.
 * Chaque nœud contient une donnée et une référence vers le nœud suivant dans la liste.
 *
 * @param <T> le type de la donnée contenue dans le nœud.
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package util;

class Node<T> {
    /**
     * La donnée stockée dans ce nœud.
     */
    T data;

    /**
     * La référence vers le nœud suivant dans la liste.
     */
    Node<T> next;

    /**
     * Constructeur de la classe Node.
     * Initialise le nœud avec une donnée et sans nœud suivant.
     *
     * @param data la donnée à stocker dans le nœud.
     */
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
