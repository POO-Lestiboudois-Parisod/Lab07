package test;

import util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();

        // Test de la méthode insert
        stack.insert(1.0);
        stack.insert(2.0);
        assert stack.toArray()[0].equals(2.0) : "Erreur : l'élément au sommet devrait être 2.0";
        assert stack.toArray()[1].equals(1.0) : "Erreur : l'élément suivant devrait être 1.0";

        // Test de la méthode pop
        assert stack.pop() == 2.0 : "Erreur : le dépilement devrait retourner 2.0";
        assert stack.pop() == 1.0 : "Erreur : le dépilement devrait retourner 1.0";

        // Test de la méthode isEmpty
        assert stack.isEmpty() : "Erreur : la pile devrait être vide";

        // Test de la méthode toString
        stack.insert(3.0);
        stack.insert(4.0);
        assert stack.toString().equals("[4.0, 3.0]") : "Erreur : la pile devrait afficher [4.0, 3.0]";

        // Test de la méthode clear
        stack.insert(5.0);
        stack.clear();
        assert stack.isEmpty() : "Erreur : la pile devrait être vide";

        // Test de la méthode toArray
        stack.insert(5.0);
        stack.insert(6.0);
        Object[] array = stack.toArray();
        assert array[0].equals(6.0) : "Erreur : l'élément au sommet devrait être 6.0";
        assert array[1].equals(5.0) : "Erreur : l'élément suivant devrait être 5.0";

        System.out.println("Tous les tests pour Stack ont réussi !");
    }
}