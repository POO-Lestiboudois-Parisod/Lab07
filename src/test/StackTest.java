/**
 * Classe de test pour la pile (Stack).
 * Cette classe teste les principales fonctionnalités de la pile, y compris l'insertion,
 * la suppression, le vidage, et la conversion en tableau ou en chaîne de caractères.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package test;

import util.Stack;

public class StackTest {

    /**
     * Point d'entrée principal pour exécuter les tests de la classe Stack.
     * @param args arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();

        // Test de la méthode insert
        /**
         * Teste l'insertion d'éléments dans la pile.
         * Vérifie que les éléments sont correctement placés au sommet de la pile.
         */
        stack.insert(1.0);
        stack.insert(2.0);
        assert stack.toArray()[0].equals(2.0) : "Erreur : l'élément au sommet devrait être 2.0";
        assert stack.toArray()[1].equals(1.0) : "Erreur : l'élément suivant devrait être 1.0";

        // Test de la méthode pop
        /**
         * Teste le retrait d'éléments de la pile.
         * Vérifie que les éléments sont retirés dans l'ordre LIFO (Last In, First Out).
         */
        assert stack.pop().equals(2.0) : "Erreur : l'élément retiré devrait être 2.0";
        assert stack.pop().equals(1.0) : "Erreur : l'élément retiré devrait être 1.0";

        // Test de la méthode isEmpty
        /**
         * Teste la méthode isEmpty.
         * Vérifie que la pile est considérée comme vide après le retrait de tous les éléments.
         */
        assert stack.isEmpty() : "Erreur : la pile devrait être vide";

        // Test de la méthode toString
        /**
         * Teste la conversion de la pile en chaîne de caractères.
         * Vérifie que la représentation en chaîne est correcte.
         */
        stack.insert(3.0);
        stack.insert(4.0);
        assert stack.toString().equals("[4.0, 3.0]") : "Erreur : la pile devrait afficher [4.0, 3.0]";

        // Test de la méthode clear
        /**
         * Teste le vidage de la pile.
         * Vérifie que la pile est vide après l'appel à la méthode clear.
         */
        stack.insert(5.0);
        stack.clear();
        assert stack.isEmpty() : "Erreur : la pile devrait être vide";

        // Test de la méthode toArray
        /**
         * Teste la conversion de la pile en tableau.
         * Vérifie que les éléments du tableau sont ordonnés comme dans la pile.
         */
        stack.insert(5.0);
        stack.insert(6.0);
        Object[] array = stack.toArray();
        assert array[0].equals(6.0) : "Erreur : l'élément au sommet devrait être 6.0";
        assert array[1].equals(5.0) : "Erreur : l'élément suivant devrait être 5.0";

        System.out.println("Tous les tests pour Stack ont réussi !");
    }
}
