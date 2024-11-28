/**
 * Classe de test pour les fonctionnalités de la calculatrice graphique JCalculator.
 * Cette classe utilise des méthodes utilitaires pour simuler les clics sur les boutons
 * et vérifier les résultats affichés.
 *
 * @author Maxime Lestiboudois
 * @author Nathan Parisod
 * @date 27/11/2024
 */
package test;

import calculator.*;

public class JCalculatorTest {

    /**
     * Point d'entrée principal pour exécuter tous les tests de JCalculator.
     * @param args arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        JCalculator calculator = new JCalculator();

        // Test d'Addition
        /**
         * Teste l'opération d'addition.
         * Simule l'ajout de deux nombres via les boutons et vérifie que le résultat est correct.
         */
        System.out.println("Test d'Addition...");
        JCalculatorTestUtils.clickButton(calculator, "2");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "+");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("5") : "Addition échouée";

        // Test de Soustraction
        /**
         * Teste l'opération de soustraction.
         * Simule la soustraction de deux nombres via les boutons et vérifie le résultat.
         */
        System.out.println("Test de Soustraction...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "0");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "4");
        JCalculatorTestUtils.clickButton(calculator, "-");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("6") : "Soustraction échouée";

        // Test de Multiplication
        /**
         * Teste l'opération de multiplication.
         * Multiplie deux nombres via les boutons et vérifie le résultat.
         */
        System.out.println("Test de Multiplication...");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "5");
        JCalculatorTestUtils.clickButton(calculator, "*");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("15") : "Multiplication échouée";

        // Test de Division
        /**
         * Teste l'opération de division.
         * Divise deux nombres via les boutons et vérifie le résultat.
         */
        System.out.println("Test de Division...");
        JCalculatorTestUtils.clickButton(calculator, "8");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "4");
        JCalculatorTestUtils.clickButton(calculator, "/");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("2") : "Division échouée";

        // Test de Backspace
        /**
         * Teste le bouton de suppression (Backspace).
         * Supprime le dernier chiffre entré et vérifie le résultat.
         */
        System.out.println("Test de Backspace...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "2");
        JCalculatorTestUtils.clickButton(calculator, "<=");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("1") : "Backspace échoué";

        // Test de CEOperator
        /**
         * Teste le bouton CE (Clear Entry).
         * Réinitialise la valeur affichée et vérifie le résultat.
         */
        System.out.println("Test de CEOperator...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "2");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "CE");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("0") : "CEOperator échoué";

        // Test de COperator
        /**
         * Teste le bouton C (Clear).
         * Réinitialise l'affichage et vide la pile, puis vérifie le résultat.
         */
        System.out.println("Test de COperator...");
        JCalculatorTestUtils.clickButton(calculator, "5");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "C");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("0") : "COperator échoué";
        assert JCalculatorTestUtils.getStackContents(calculator).length == 0 : "La pile devrait être vide";

        // Test de Memory Store et Recall
        /**
         * Teste les boutons MS (Memory Store) et MR (Memory Recall).
         * Mémorise une valeur puis la rappelle, en vérifiant le résultat.
         */
        System.out.println("Test de Memory Store et Recall...");
        JCalculatorTestUtils.clickButton(calculator, "5");
        JCalculatorTestUtils.clickButton(calculator, "MS");
        JCalculatorTestUtils.clickButton(calculator, "CE");
        JCalculatorTestUtils.clickButton(calculator, "MR");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("5") : "Memory Store/Recall échoué";

        // Test de Square
        /**
         * Teste le bouton carré (x²).
         * Calcule le carré d'un nombre et vérifie le résultat.
         */
        System.out.println("Test de Square...");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "x^2");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("9") : "Square échoué";

        // Test de Sqrt
        /**
         * Teste le bouton racine carrée (Sqrt).
         * Calcule la racine carrée d'un nombre et vérifie le résultat.
         */
        System.out.println("Test de Sqrt...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "6");
        JCalculatorTestUtils.clickButton(calculator, "Sqrt");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("4") : "Sqrt échoué";

        // Test de Negate
        /**
         * Teste le bouton de changement de signe (+/-).
         * Change le signe du nombre affiché et vérifie le résultat.
         */
        System.out.println("Test de Negate...");
        JCalculatorTestUtils.clickButton(calculator, "6");
        JCalculatorTestUtils.clickButton(calculator, "+/-");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("-6") : "Negate échoué";

        System.out.println("Tous les tests de JCalculator réussis !");
    }
}
