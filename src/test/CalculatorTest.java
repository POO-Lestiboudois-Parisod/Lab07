package test;

import calculator.*;

public class CalculatorTest {
    public static void main(String[] args) {

        // Test d'Addition
        Addition addition = new Addition();
        State state = new State();
        state.appendToCurrentValue('2');
        state.appendToCurrentValue('3');
        state.pushCurrentValue();
        state.appendToCurrentValue('4');
        state.pushCurrentValue();
        Double value1 = state.popFromStack();   // Récupérer les valeurs de la pile
        Double value2 = state.popFromStack();   // Récupérer les valeurs de la pile
        Double result = addition.apply(value1, value2);     // Appliquer l'addition
        state.setCurrentValue(result.toString());   // Stocker le résultat dans l'état
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("7.0") : "execute() a échoué";


        // Test de BackspaceOperator
        BackspaceOperator backspaceOperator = new BackspaceOperator(state);
        state.setCurrentValue("123");
        backspaceOperator.execute();
        assert state.getCurrentValue().equals("12") : "execute() a échoué";


        // Test de CEOperator
        CEOperator ceOperator = new CEOperator(state);
        state.setCurrentValue("123");
        ceOperator.execute();
        assert state.getCurrentValue().equals("0") : "execute() a échoué";


        // Test de COperator
        COperator cOperator = new COperator(state);
        state.setCurrentValue("123");
        cOperator.execute();
        assert state.getCurrentValue().equals("0") : "execute() a échoué";


        // Test de Division
        Division divide = new Division();
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        value1 = state.popFromStack();   // Récupérer les valeurs de la pile
        value2 = state.popFromStack();   // Récupérer les valeurs de la pile
        result = divide.apply(value1, value2);     // Appliquer la division
        state.setCurrentValue(result.toString());   // Stocker le résultat dans l'état
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("5.0") : "execute() a échoué";

        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("0");
        state.pushCurrentValue();
        value1 = state.popFromStack();   // Récupérer les valeurs de la pile
        value2 = state.popFromStack();   // Récupérer les valeurs de la pile
        result = divide.apply(value1, value2);     // Appliquer la division
        state.setCurrentValue(result.toString());   // Stocker le résultat dans l'état
        assert state.getCurrentValue().equals("Infinity") : "execute() a échoué";



        // Test d'EnterOperator
        EnterOperator enterOperator = new EnterOperator(state);
        state.setCurrentValue("123");
        enterOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";


        // Test de FractionOperator
        FractionnalOperator fractionOperator = new FractionnalOperator(state);
        state.setCurrentValue("2");
        fractionOperator.execute();
        assert state.getCurrentValue().equals("0.5") : "execute() a échoué";


        // Test de MROperator
        MROperator mrOperator = new MROperator(state);
        state.setCurrentValue("123");
        mrOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";


        // Test de MSOperator
        MSOperator msOperator = new MSOperator(state);
        state.setCurrentValue("123");
        msOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";


        // Test de Multiplication
        Multiplication multiplication = new Multiplication();
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        value1 = state.popFromStack();   // Récupérer les valeurs de la pile
        value2 = state.popFromStack();   // Récupérer les valeurs de la pile
        result = multiplication.apply(value1, value2);     // Appliquer la multiplication
        state.setCurrentValue(result.toString());   // Stocker le résultat dans l'état
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("20.0") : "execute() a échoué";


        // Test de NumberOperator
        NumberOperator numberOperator = new NumberOperator(5, state);
        state.setCurrentValue("123");
        numberOperator.execute();
        assert state.getCurrentValue().equals("1235") : "execute() a échoué";


        // Test de OperandOperator
        OperandOperator operandOperator = new OperandOperator(new Addition(), state);   //TODO
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        operandOperator.execute();
        assert state.getCurrentValue().equals("12.0") : "execute() a échoué";


        // Test de PointOperator
        PointOperator pointOperator = new PointOperator(state);
        state.setCurrentValue("123");
        pointOperator.execute();
        assert state.getCurrentValue().equals("123.") : "execute() a échoué";


        // Test de PositiveNegativeOperator
        PositiveNegativeOperator positiveNegativeOperator = new PositiveNegativeOperator(state);
        state.setCurrentValue("123");
        positiveNegativeOperator.execute();
        assert state.getCurrentValue().equals("-123") : "execute() a échoué";
        state.setCurrentValue("-123");
        positiveNegativeOperator.execute();
        assert state.getCurrentValue().equals("123") : "execute() a échoué";


        // Test de SqrtOperator
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
        SquareOperator squareOperator = new SquareOperator(state);
        state.setCurrentValue("4");
        squareOperator.execute();
        assert state.getCurrentValue().equals("16.0") : "execute() a échoué";

        state.setCurrentValue("-4");
        squareOperator.execute();
        assert state.getCurrentValue().equals("16.0") : "execute() a échoué";


        // Test de Substraction
        Substraction substraction = new Substraction();
        state.setCurrentValue("10");
        state.pushCurrentValue();
        state.setCurrentValue("2");
        state.pushCurrentValue();
        value1 = state.popFromStack();   // Récupérer les valeurs de la pile
        value2 = state.popFromStack();   // Récupérer les valeurs de la pile
        result = substraction.apply(value1, value2);     // Appliquer la soustraction
        state.setCurrentValue(result.toString());   // Stocker le résultat dans l'état
        state.pushCurrentValue();
        assert state.getCurrentValue().equals("8.0") : "execute() a échoué";



        System.out.println("Tous les tests de Calculator réussis !");
    }
}
