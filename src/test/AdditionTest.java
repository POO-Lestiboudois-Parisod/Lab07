package test;

import calculator.State;
import calculator.Addition;

public class AdditionTest {
    public static void main(String[] args) {

        // Test de la méthode apply
        Addition addition = new Addition();
        State state = new State();
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.pushCurrentValue();
        addition.apply(2.0, 3.0);
        assert state.getCurrentValue().equals("5.0") : "apply() a échoué";

        System.out.println("Test Addition réussi !");
    }
}