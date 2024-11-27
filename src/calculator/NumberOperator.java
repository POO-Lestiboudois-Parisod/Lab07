/**
 * La classe {@code NumberOperator} représente un opérateur qui ajoute une valeur numérique à
 * l'état actuel de l'application.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

import java.sql.SQLOutput;

public class NumberOperator extends Operator {

    /**
     * La valeur numérique associée à cet opérateur.
     */
    private final int value;

    /**
     * Constructeur de la classe {@code NumberOperator}.
     *
     * @param value La valeur numérique que cet opérateur représente.
     * @param state L'état dans lequel l'opérateur sera appliqué.
     */
    public NumberOperator(int value, State state) {
        super(state);
        this.value = value;
    }

    /**
     * Exécute l'opération en ajoutant la valeur numérique à la chaîne actuelle
     * dans l'état en cours. La valeur est convertie en caractère et ajoutée
     * à l'état via la méthode {@code appendToCurrentValue}.
     */
    @Override
    public void execute() {
        state.appendToCurrentValue((char) (value + 48));    // 48 est le code ASCII pour '0'
    }
}
