/**
 * La classe {@code State} représente l'état d'une calculatrice, incluant la gestion de la valeur
 * actuelle, de la pile de valeurs, de la mémoire et des erreurs. Elle permet de manipuler et
 * d'effectuer des opérations sur ces éléments tout au long de l'exécution d'une série d'opérations.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

import util.Stack;

public class State {

    /**
     * La pile contenant les valeurs précédemment calculées.
     */
    private final Stack<Double> stack = new Stack<>();

    /**
     * La valeur actuelle de l'affichage sous forme de chaîne de caractères.
     */
    private String currentValue = "0";

    /**
     * Indicateur d'erreur. Si {@code true}, une erreur a eu lieu et le calcul est interrompu.
     */
    private boolean error = false;

    /**
     * La mémoire pour stocker une valeur temporaire.
     */
    private Double memory;

    /**
     * Constructeur de la classe {@code State}.
     * Initialise l'état avec une pile vide, une valeur actuelle à "0" et aucune erreur.
     */
    public State() {
    }

    /**
     * Ajoute un caractère à la valeur actuelle, en le convertissant en chaîne.
     * Si la valeur actuelle est "0", elle est remplacée par le caractère.
     *
     * @param c Le caractère à ajouter à la valeur actuelle.
     */
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

    /**
     * Supprime le dernier caractère de la valeur actuelle.
     * Si la valeur actuelle a plus d'un caractère, elle est tronquée. Sinon, elle devient "0".
     */
    public void backspace() {
        if (!error && currentValue.length() > 1) {
            currentValue = currentValue.substring(0, currentValue.length() - 1);
        } else {
            currentValue = "0";
        }
    }

    /**
     * Réinitialise la valeur actuelle à "0".
     */
    public void clearCurrentValue() {
        currentValue = "0";
    }

    /**
     * Pousse la valeur actuelle sur la pile après l'avoir convertie en {@code double}.
     * Réinitialise ensuite la valeur actuelle à "0".
     */
    public void pushCurrentValue() {
        try {
            double value = Double.parseDouble(currentValue);
            stack.insert(value);
            clearCurrentValue();
        } catch (NumberFormatException e) {
            System.out.println("Error in pushCurrentValue");
        }
    }

    /**
     * Définit un message d'erreur et modifie la valeur actuelle pour afficher "Erreur".
     * L'indicateur d'erreur est mis à {@code true}.
     *
     * @param message Le message d'erreur à afficher.
     */
    public void setError(String message) {
        error = true;
        currentValue = "Erreur";
    }

    /**
     * Réinitialise l'erreur et rétablit la valeur actuelle à "0".
     */
    public void resetError() {
        error = false;
        clearCurrentValue();
    }

    /**
     * Pop une valeur de la pile. Si la pile est vide, une erreur est signalée.
     *
     * @return La valeur popée de la pile, ou {@code null} en cas d'erreur.
     */
    public Double popFromStack() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Error in popFromStack");
            return null;
        }
    }

    /**
     * Vide la pile de toutes ses valeurs.
     */
    public void clearStack() {
        stack.clear();
    }

    /**
     * Obtient la valeur actuelle de l'affichage.
     *
     * @return La valeur actuelle sous forme de chaîne de caractères.
     */
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * Vérifie si une erreur a eu lieu.
     *
     * @return {@code true} si une erreur a eu lieu, sinon {@code false}.
     */
    public boolean hasError() {
        return error;
    }

    /**
     * Convertit la valeur actuelle de négative à positive, si elle est négative.
     * Si la valeur est déjà positive, rien n'est fait.
     */
    public void negativeToPositive() {
        currentValue = currentValue.substring(1, currentValue.length() - 1);
    }

    /**
     * Convertit la valeur actuelle de positive à négative, si elle est positive.
     * Si la valeur est déjà négative, rien n'est fait.
     */
    public void positiveToNegative() {
        currentValue = "-" + currentValue;
    }

    /**
     * Définit une nouvelle valeur actuelle.
     *
     * @param currentValue La nouvelle valeur actuelle sous forme de chaîne.
     */
    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * Obtient la pile contenant les valeurs précédemment calculées.
     *
     * @return La pile de valeurs.
     */
    public Stack<Double> getStack() {
        return stack;
    }

    /**
     * Obtient la valeur stockée en mémoire.
     *
     * @return La valeur stockée en mémoire.
     */
    public Double getMemory() {
        return memory;
    }

    /**
     * Définit la valeur à stocker en mémoire.
     *
     * @param memory La valeur à stocker en mémoire.
     */
    public void setMemory(Double memory) {
        this.memory = memory;
    }
}
