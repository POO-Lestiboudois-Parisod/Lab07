/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

import util.Stack;

public class State {
    private final Stack<Double> stack = new Stack<>();
    private String currentValue = "0";
    private boolean error = false;
    private Double memory;


    public State() {
    }

    public void appendToCurrentValue(char c) {

        if (error) {
            resetError();
        }
        if (currentValue.equals("0")) {
            currentValue = Character.toString(c);
        } else {
            currentValue += c;
        }
   }

    public void backspace() {
        if (!error && currentValue.length() > 1) {
            currentValue = currentValue.substring(0, currentValue.length() - 1);
        } else {
            currentValue = "0";
        }
    }

    public void clearCurrentValue() {
        currentValue = "0";
    }

    public void pushCurrentValue() {
        try {
            double value = Double.parseDouble(currentValue);
            stack.insert(value);
            clearCurrentValue();
        } catch (NumberFormatException e) {
            System.out.println("Error in pushCurrentValue");
        }
    }

    public void setError(String message) {
        error = true;
        currentValue = "Erreur";
    }

    public void resetError() {
        error = false;
        clearCurrentValue();
    }

    public Double popFromStack() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Error in popFromStack");
            return null;
        }
    }

    public void clearStack() {
        stack.clear();
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public boolean hasError() {
        return error;
    }

    public void negativeToPositive() {
        currentValue = currentValue.substring(1, currentValue.length() - 1);
    }

    public void positiveToNegative() {
        currentValue = "-" + currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public Stack<Double> getStack() {
        return stack;
    }

    public Double getMemory() {
        return memory;
    }
    public void setMemory(Double memory) {
        this.memory = memory;
    }


}
