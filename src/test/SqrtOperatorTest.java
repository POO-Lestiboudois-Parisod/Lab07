package test;

import calculator.State;
import calculator.SqrtOperator;

public class SqrtOperatorTest {
    public static void main(String[] args) {

        // Test de la méthode execute
        SqrtOperator sqrtOperator = new SqrtOperator(new State());
        State state = new State();
        state.appendToCurrentValue('2');
        state.pushCurrentValue();
        sqrtOperator.execute();
        assert state.getCurrentValue().equals("1.4142135623730951") : "execute() a échoué";

        state.setCurrentValue("0");
        state.appendToCurrentValue('-');
        state.appendToCurrentValue('2');
        state.pushCurrentValue();
        sqrtOperator.execute();
        assert state.getCurrentValue().equals("Erreur") : "execute() a échoué";


        System.out.println("Tous les tests de SqrtOperator réussis !");
    }
}
