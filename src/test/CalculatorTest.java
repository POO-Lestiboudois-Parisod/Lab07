/**
 * Classe de test pour les fonctionnalités d'une calculatrice.
 * Contient des tests pour vérifier le bon fonctionnement des opérations arithmétiques
 * et des opérateurs associés.
 *
 * @autor Maxime Lestiboudois
 * @autor Nathan Parisod
 * @date 27/11/2024
 */
package test;

import calculator.*;

public class CalculatorTest {

    /**
     * Point d'entrée principal pour exécuter tous les tests de la calculatrice.
     * @param args arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {

        // Test d'Addition
        /**
         * Teste l'opération d'addition.
         * Ajoute deux valeurs stockées dans l'état et vérifie que le résultat est correct.
         */
        Addition addition = new Addition();
        State state = new State();
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.pushCurrentValue();
        state.appendToCurrentValue('4');
        state.pushCurrentValue();
        Double value1 = state.popFromStack();
        Double value2 = state.popFromStack();
        Double result = addition.apply(value1, value2);
        state.setCurrentValue(result.toString());
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("7.0") : "execute() a échoué";

        // Test de BackspaceOperator
        /**
         * Teste l'opérateur de suppression (BackspaceOperator).
         * Supprime le dernier caractère de la valeur courante et vérifie le résultat.
         */
        BackspaceOperator backspaceOperator = new BackspaceOperator(state);
        state.setCurrentValue("123");
        backspaceOperator.execute();
        assert state.getCurrentValue().equals("12") : "execute() a échoué";

        // Test de CEOperator
        /**
         * Teste l'opérateur CE (Clear Entry).
         * Remet la valeur courante à zéro et vérifie le résultat.
         */
        CEOperator ceOperator = new CEOperator(state);
        state.setCurrentValue("123");
        ceOperator.execute();
        assert state.getCurrentValue().equals("0") : "execute() a échoué";

        // Test de COperator
        /**
         * Teste l'opérateur C (Clear).
         * Remet la valeur courante et l'état entier à zéro, et vérifie le résultat.
         */
        COperator cOperator = new COperator(state);
        state.setCurrentValue("123");
        cOperator.execute();
        assert state.getCurrentValue().equals("0") : "execute() a échoué";

        // Test de Division
        /**
         * Teste l'opération de division.
         * Divise deux valeurs et vérifie le résultat pour des cas valides et un cas de division par zéro.
         */
        Division divide = new Division();
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        value1 = state.popFromStack();
        value2 = state.popFromStack();
        result = divide.apply(value1, value2);
        state.setCurrentValue(result.toString());
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("5.0") : "execute() a échoué";

        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("0");
        state.pushCurrentValue();
        value1 = state.popFromStack();
        value2 = state.popFromStack();
        result = divide.apply(value1, value2);
        state.setCurrentValue(result.toString());
        assert state.getCurrentValue().equals("Infinity") : "execute() a échoué";

        // Test d'EnterOperator
        /**
         * Teste l'opérateur Enter.
         * Ajoute la valeur courante à la pile et vérifie que la valeur reste inchangée.
         */
        EnterOperator enterOperator = new EnterOperator(state);
        state.setCurrentValue("123");
        enterOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";

        // Test de FractionOperator
        /**
         * Teste l'opérateur de fraction (FractionOperator).
         * Transforme une valeur en sa fraction (1/x) et vérifie le résultat.
         */
        FractionnalOperator fractionOperator = new FractionnalOperator(state);
        state.setCurrentValue("2");
        fractionOperator.execute();
        assert state.getCurrentValue().equals("0.5") : "execute() a échoué";

        // Test de MROperator
        /**
         * Teste l'opérateur MR (Memory Recall).
         * Rappelle une valeur précédemment mémorisée et vérifie le résultat.
         */
        MROperator mrOperator = new MROperator(state);
        state.setCurrentValue("123");
        mrOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";

        // Test de MSOperator
        /**
         * Teste l'opérateur MS (Memory Store).
         * Mémorise la valeur courante et vérifie qu'elle est correctement stockée.
         */
        MSOperator msOperator = new MSOperator(state);
        state.setCurrentValue("123");
        msOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";

        // Test de Multiplication
        /**
         * Teste l'opération de multiplication.
         * Multiplie deux valeurs stockées dans l'état et vérifie le résultat.
         */
        Multiplication multiplication = new Multiplication();
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        value1 = state.popFromStack();
        value2 = state.popFromStack();
        result = multiplication.apply(value1, value2);
        state.setCurrentValue(result.toString());
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("20.0") : "execute() a échoué";

        // Test de NumberOperator
        /**
         * Teste l'ajout d'un chiffre via NumberOperator.
         * Ajoute un chiffre à la fin de la valeur courante et vérifie le résultat.
         */
        NumberOperator numberOperator = new NumberOperator(5, state);
        state.setCurrentValue("123");
        numberOperator.execute();
        assert state.getCurrentValue().equals("1235") : "execute() a échoué";

        // Test de OperandOperator
        /**
         * Teste un opérateur générique avec un opérande (OperandOperator).
         * Effectue une opération arithmétique (addition) et vérifie le résultat.
         */
        OperandOperator operandOperator = new OperandOperator(new Addition(), state);
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        operandOperator.execute();
        assert state.getCurrentValue().equals("12.0") : "execute() a échoué";

        // Test de PointOperator
        /**
         * Teste l'opérateur Point.
         * Ajoute un point décimal à la valeur courante et vérifie le résultat.
         */
        PointOperator pointOperator = new PointOperator(state);
        state.setCurrentValue("123");
        pointOperator.execute();
        assert state.getCurrentValue().equals("123.") : "execute() a échoué";

        // Test de PositiveNegativeOperator
        /**
         * Teste l'opérateur de changement de signe.
         * Change le signe de la valeur courante et vérifie le résultat.
         */
        PositiveNegativeOperator positiveNegativeOperator = new PositiveNegativeOperator(state);
        state.setCurrentValue("123");
        positiveNegativeOperator.execute();
        assert state.getCurrentValue().equals("-123") : "execute() a échoué";
        state.setCurrentValue("-123");
        positiveNegativeOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";

        // Test de SqrtOperator
        /**
         * Teste l'opérateur de racine carrée.
         * Calcule la racine carrée d'une valeur et vérifie les résultats pour des cas positifs, nuls et négatifs.
         */
        SqrtOperator sqrtOperator = new SqrtOperator(state);
        state.setCurrentValue("4");
        sqrtOperator.execute();
        assert state.getCurrentValue().equals("2.0") : "execute() a échoué";

        state.setCurrentValue("0");
        sqrtOperator.execute();
        assert state.getCurrentValue().equals("0.0") : "execute() a échoué";

        state.setCurrentValue("-4");
        sqrtOperator.execute();
        assert state.getCurrentValue().equals("Erreur") : "execute() a échoué";

        // Test de SquareOperator
        /**
         * Teste l'opérateur de mise au carré (SquareOperator).
         * Calcule le carré d'une valeur et vérifie le résultat.
         */
        SquareOperator squareOperator = new SquareOperator(state);
        state.setCurrentValue("4");
        squareOperator.execute();
        assert state.getCurrentValue().equals("16.0") : "execute() a échoué";

        state.setCurrentValue("-4");
        squareOperator.execute();
        assert state.getCurrentValue().equals("16.0") : "execute() a échoué";

        // Test de Substraction
        /**
         * Teste l'opération de soustraction.
         * Soustrait deux valeurs stockées dans l'état et vérifie le résultat.
         */
        Substraction substraction = new Substraction();
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        value1 = state.popFromStack();
        value2 = state.popFromStack();
        result = substraction.apply(value1, value2);
        state.setCurrentValue(result.toString());
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("8.0") : "execute() a échoué";

        System.out.println("Tous les tests de Calculator réussis !");
    }
}
