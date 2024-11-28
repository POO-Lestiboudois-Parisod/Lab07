/**
 * Classe de test pour la classe State.
 * Teste les différentes fonctionnalités offertes par State, y compris la gestion de la valeur courante,
 * des erreurs, de la pile et de la mémoire.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package test;

import calculator.State;

public class StateTest {

    /**
     * Point d'entrée principal pour exécuter les tests de la classe State.
     * @param args arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        State state = new State();

        // Test de la méthode appendToCurrentValue
        /**
         * Teste l'ajout de caractères à la valeur courante.
         * Vérifie que la valeur courante est correctement mise à jour après chaque ajout.
         */
        state.appendToCurrentValue('1');
        assert state.getCurrentValue().equals("1") : "appendToCurrentValue('1') a échoué";
        state.appendToCurrentValue('2');
        assert state.getCurrentValue().equals("12") : "appendToCurrentValue('2') a échoué";
        state.appendToCurrentValue('3');
        assert state.getCurrentValue().equals("123") : "appendToCurrentValue('3') a échoué";

        // Test de la méthode backspace
        /**
         * Teste la suppression du dernier caractère de la valeur courante.
         * Vérifie que le caractère est correctement supprimé.
         */
        state.backspace();
        assert state.getCurrentValue().equals("12") : "backspace() a échoué";

        // Test de la méthode clearCurrentValue
        /**
         * Teste la réinitialisation de la valeur courante à zéro.
         * Vérifie que la valeur courante devient "0".
         */
        state.clearCurrentValue();
        assert state.getCurrentValue().equals("0") : "clearCurrentValue() a échoué";

        // Test de la méthode pushCurrentValue
        /**
         * Teste l'ajout de la valeur courante à la pile.
         * Vérifie que la valeur courante est réinitialisée après l'ajout.
         */
        state.appendToCurrentValue('1');
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("0") : "pushCurrentValue() a échoué";

        // Test de la méthode setError
        /**
         * Teste la définition d'une erreur.
         * Vérifie que la valeur courante est remplacée par le message d'erreur.
         */
        state.setError("Erreur");
        assert state.getCurrentValue().equals("Erreur") : "setError() a échoué";

        // Test de la méthode resetError
        /**
         * Teste la réinitialisation d'une erreur.
         * Vérifie que la valeur courante redevient "0".
         */
        state.resetError();
        assert state.getCurrentValue().equals("0") : "resetError() a échoué";

        // Test de la méthode popFromStack
        /**
         * Teste le retrait d'une valeur de la pile.
         * Vérifie que la valeur retirée devient la valeur courante.
         */
        state.appendToCurrentValue('1');
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.popFromStack();
        assert state.getCurrentValue().equals("123") : "popFromStack() a échoué";

        // Test de la méthode clearStack
        /**
         * Teste le vidage de la pile.
         * Vérifie que la pile est complètement vidée.
         */
        state.clearStack();
        assert state.getCurrentValue().equals("0") : "clearStack() a échoué";

        // Test de la méthode getCurrentValue
        /**
         * Teste la récupération de la valeur courante.
         * Vérifie que la valeur courante est correcte.
         */
        assert state.getCurrentValue().equals("0") : "getCurrentValue() a échoué";

        // Test de la méthode hasError
        /**
         * Teste la vérification de la présence d'une erreur.
         * Vérifie qu'aucune erreur n'est détectée lorsque la valeur courante est normale.
         */
        assert !state.hasError() : "hasError() a échoué";

        // Test de la méthode negativeToPositive
        /**
         * Teste la conversion d'une valeur négative en valeur positive.
         * Vérifie que le signe de la valeur courante est correctement changé.
         */
        state.appendToCurrentValue('-');
        state.appendToCurrentValue('1');
        state.negativeToPositive();
        assert state.getCurrentValue().equals("1") : "negativeToPositive() a échoué";
        state.negativeToPositive();
        assert state.getCurrentValue().equals("1") : "negativeToPositive() a échoué";

        // Test de la méthode positiveToNegative
        /**
         * Teste la conversion d'une valeur positive en valeur négative.
         * Vérifie que le signe de la valeur courante est correctement changé.
         */
        state.positiveToNegative();
        assert state.getCurrentValue().equals("-1") : "positiveToNegative() a échoué";
        state.positiveToNegative();
        assert state.getCurrentValue().equals("-1") : "positiveToNegative() a échoué";

        // Test de la méthode setCurrentValue
        /**
         * Teste la définition explicite de la valeur courante.
         * Vérifie que la valeur courante est correctement mise à jour.
         */
        state.clearStack();
        state.setCurrentValue("123");
        assert state.getCurrentValue().equals("123") : "setCurrentValue() a échoué";

        // Test de la méthode setMemory
        /**
         * Teste la définition de la mémoire.
         * Vérifie que la valeur est correctement stockée en mémoire.
         */
        state.setMemory(123.0);
        assert state.getMemory().equals(123.0) : "setMemory() a échoué";

        // Test de la méthode getMemory
        /**
         * Teste la récupération de la valeur en mémoire.
         * Vérifie que la valeur stockée est correcte.
         */
        assert state.getMemory().equals(123.0) : "getMemory() a échoué";

        System.out.println("Tous les tests pour State ont réussi !");
    }
}
