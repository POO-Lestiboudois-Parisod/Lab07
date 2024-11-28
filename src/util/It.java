/**
 * Classe It représentant un itérateur générique pour une structure de données chaînée.
 * Permet de parcourir les éléments d'une liste chaînée de manière séquentielle.
 *
 * @param <T> le type des éléments à parcourir.
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package util;

import java.util.NoSuchElementException;

public class It<T> {
    /**
     * Le nœud courant de la liste chaînée.
     */
    Node<T> current;

    /**
     * Constructeur de l'itérateur.
     * Initialise l'itérateur à partir d'un nœud de départ.
     *
     * @param start le nœud de départ de l'itérateur.
     */
    public It(Node<T> start) {
        this.current = start;
    }

    /**
     * Vérifie si l'itérateur a un élément suivant.
     *
     * @return true si un élément suivant existe, false sinon.
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Renvoie l'élément suivant dans la liste chaînée et avance l'itérateur.
     *
     * @return la valeur de l'élément courant.
     * @throws NoSuchElementException si aucun élément suivant n'existe.
     */
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T value = current.data;
        current = current.next;
        return value;
    }
}
