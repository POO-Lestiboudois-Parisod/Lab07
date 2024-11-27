/**
 * La classe {@code PointOperator} représente un opérateur qui ajoute un point ('.')
 * à la valeur actuelle de l'état, permettant ainsi de saisir des nombres décimaux.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class PointOperator extends Operator {

    /**
     * Constructeur de la classe {@code PointOperator}.
     *
     * @param state L'état dans lequel le point sera ajouté à la valeur actuelle.
     */
    public PointOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération en ajoutant un point ('.') à la valeur actuelle dans l'état.
     */
    @Override
    public void execute() {
        state.appendToCurrentValue('.');
    }
}
