package test;

import calculator.State;

public class StateTest {
    public static void main(String[] args) {
        State state = new State();

        // Test de la méthode appendToCurrentValue
        state.appendToCurrentValue('1');
        assert state.getCurrentValue().equals("1") : "appendToCurrentValue('1') a échoué";
        state.appendToCurrentValue('2');
        assert state.getCurrentValue().equals("12") : "appendToCurrentValue('2') a échoué";
        state.appendToCurrentValue('3');
        assert state.getCurrentValue().equals("123") : "appendToCurrentValue('3') a échoué";

        // Test de la méthode backspace
        state.backspace();
        assert state.getCurrentValue().equals("12") : "backspace() a échoué";

        // Test de la méthode clearCurrentValue
        state.clearCurrentValue();
        assert state.getCurrentValue().equals("0") : "clearCurrentValue() a échoué";

        // Test de la méthode pushCurrentValue
        state.appendToCurrentValue('1');
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("0") : "pushCurrentValue() a échoué";

        // Test de la méthode setError
        state.setError("Erreur");
        assert state.getCurrentValue().equals("Erreur") : "setError() a échoué";

        // Test de la méthode resetError
        state.resetError();
        assert state.getCurrentValue().equals("0") : "resetError() a échoué";

        // Test de la méthode popFromStack
        state.appendToCurrentValue('1');
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.popFromStack();
        assert state.getCurrentValue().equals("123") : "popFromStack() a échoué";

        // Test de la méthode clearStack
        state.clearStack();
        assert state.getCurrentValue().equals("0") : "clearStack() a échoué";

        // Test de la méthode getCurrentValue
        assert state.getCurrentValue().equals("0") : "getCurrentValue() a échoué";

        // Test de la méthode hasError
        assert !state.hasError() : "hasError() a échoué";

        // Test de la méthode negativeToPositive
        state.appendToCurrentValue('-');
        state.appendToCurrentValue('1');
        state.negativeToPositive();
        assert state.getCurrentValue().equals("1") : "negativeToPositive() a échoué";
        state.negativeToPositive();
        assert state.getCurrentValue().equals("1") : "negativeToPositive() a échoué";

        // Test de la méthode positiveToNegative
        state.positiveToNegative();
        assert state.getCurrentValue().equals("-1") : "positiveToNegative() a échoué";
        state.positiveToNegative();
        assert state.getCurrentValue().equals("-1") : "positiveToNegative() a échoué";

        // Test de la méthode setCurrentValue
        state.clearStack();
        state.setCurrentValue("123");
        assert state.getCurrentValue().equals("123") : "setCurrentValue() a échoué";

        // Test de la méthode setMemory
        state.setMemory(123.0);
        assert state.getMemory().equals(123.0) : "setMemory() a échoué";

        // Test de la méthode getMemory
        assert state.getMemory().equals(123.0) : "getMemory() a échoué";


        System.out.println("Tous les tests pour State ont réussi !");
    }
}