/**
 * La classe {@code PositiveNegativeOperator} représente un opérateur qui permet de
 * basculer la valeur actuelle entre positive et négative dans l'état. Si la valeur est
 * positive, elle devient négative, et si elle est négative, elle devient positive.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class PositiveNegativeOperator extends Operator {

    /**
     * Constructeur de la classe {@code PositiveNegativeOperator}.
     *
     * @param state L'état dans lequel la valeur sera convertie entre positive et négative.
     */
    public PositiveNegativeOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération en basculant la valeur actuelle entre positive et négative.
     * Si la valeur actuelle est négative, elle devient positive, et vice versa.
     */
    @Override
    public void execute() {
        if(state.getCurrentValue().indexOf(0) == '-'){
            state.negativeToPositive();
        }
        else{
            state.positiveToNegative();
        }
    }
}
