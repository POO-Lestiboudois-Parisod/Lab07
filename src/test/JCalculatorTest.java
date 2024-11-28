// JCalculatorTest.java
package test;

import calculator.*;

public class JCalculatorTest {
    public static void main(String[] args) {

        JCalculator calculator = new JCalculator();

        // Test d'Addition
        System.out.println("Test d'Addition...");
        JCalculatorTestUtils.clickButton(calculator, "2");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "+");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("5") : "Addition échouée";


        // Test de Soustraction
        System.out.println("Test de Soustraction...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "0");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "4");
        JCalculatorTestUtils.clickButton(calculator, "-");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("6") : "Soustraction échouée";


        // Test de Multiplication
        System.out.println("Test de Multiplication...");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "5");
        JCalculatorTestUtils.clickButton(calculator, "*");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("15") : "Multiplication échouée";


        // Test de Division
        System.out.println("Test de Division...");
        JCalculatorTestUtils.clickButton(calculator, "8");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "4");
        JCalculatorTestUtils.clickButton(calculator, "/");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("2") : "Division échouée";


        // Test de Backspace
        System.out.println("Test de Backspace...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "2");
        JCalculatorTestUtils.clickButton(calculator, "<=");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("1") : "Backspace échoué";


        // Test de CEOperator
        System.out.println("Test de CEOperator...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "2");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "CE");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("0") : "CEOperator échoué";


        // Test de COperator
        System.out.println("Test de COperator...");
        JCalculatorTestUtils.clickButton(calculator, "5");
        JCalculatorTestUtils.clickButton(calculator, "Ent");
        JCalculatorTestUtils.clickButton(calculator, "C");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("0") : "COperator échoué";
        assert JCalculatorTestUtils.getStackContents(calculator).length == 0 : "La pile devrait être vide";


        // Test de Memory Store et Recall
        System.out.println("Test de Memory Store et Recall...");
        JCalculatorTestUtils.clickButton(calculator, "5");
        JCalculatorTestUtils.clickButton(calculator, "MS");
        JCalculatorTestUtils.clickButton(calculator, "CE");
        JCalculatorTestUtils.clickButton(calculator, "MR");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("5") : "Memory Store/Recall échoué";


        // Test de Square
        System.out.println("Test de Square...");
        JCalculatorTestUtils.clickButton(calculator, "3");
        JCalculatorTestUtils.clickButton(calculator, "x^2");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("9") : "Square échoué";


        // Test de Sqrt
        System.out.println("Test de Sqrt...");
        JCalculatorTestUtils.clickButton(calculator, "1");
        JCalculatorTestUtils.clickButton(calculator, "6");
        JCalculatorTestUtils.clickButton(calculator, "Sqrt");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("4") : "Sqrt échoué";


        // Test de Negate
        System.out.println("Test de Negate...");
        JCalculatorTestUtils.clickButton(calculator, "6");
        JCalculatorTestUtils.clickButton(calculator, "+/-");
        assert JCalculatorTestUtils.getDisplayValue(calculator).equals("-6") : "Negate échoué";


        System.out.println("Tous les tests de JCalculator réussis !");
    }
}