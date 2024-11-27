package calculator;

public class Test {
    public static void main(String[] args) {
        new JCalculator();

        // Test addition
        calculator.enterNumber(5);
        calculator.enterNumber(3);
        calculator.performOperation('+');
        System.out.println("5 + 3 = " + calculator.getCurrentValue()); // Expected: 8

        // Test subtraction
        calculator.enterNumber(10);
        calculator.enterNumber(4);
        calculator.performOperation('-');
        System.out.println("10 - 4 = " + calculator.getCurrentValue()); // Expected: 6

        // Test multiplication
        calculator.enterNumber(7);
        calculator.enterNumber(6);
        calculator.performOperation('*');
        System.out.println("7 * 6 = " + calculator.getCurrentValue()); // Expected: 42

        // Test division
        calculator.enterNumber(8);
        calculator.enterNumber(2);
        calculator.performOperation('/');
        System.out.println("8 / 2 = " + calculator.getCurrentValue()); // Expected: 4

        // Test division by zero
        calculator.enterNumber(8);
        calculator.enterNumber(0);
        calculator.performOperation('/');
        System.out.println("8 / 0 = " + calculator.getCurrentValue()); // Expected: Error or Infinity

        // Test clear
        calculator.clear();
        System.out.println("Clear: " + calculator.getCurrentValue()); // Expected: 0

        // Test other buttons if any
        // Example: Test square root button
        calculator.enterNumber(16);
        calculator.performOperation('√');
        System.out.println("√16 = " + calculator.getCurrentValue()); // Expected: 4

        // Add more tests for other buttons and operations as needed
    }
}