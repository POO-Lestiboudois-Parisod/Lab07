/**
 * La classe {@code SquareOperator} représente un opérateur qui calcule le carré de la
 * valeur actuelle dans l'état. Si la valeur est valide, son carré est calculé et le
 * résultat est stocké dans l'état.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class SquareOperator extends Operator {

    /**
     * Constructeur de la classe {@code SquareOperator}.
     *
     * @param state L'état dans lequel le carré sera calculé.
     */
    public SquareOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération en calculant le carré de la valeur actuelle dans l'état.
     * Si la valeur est valide, son carré est calculé et le résultat est stocké.
     * En cas d'erreur, un message d'erreur est défini dans l'état.
     */
    @Override
    public void execute() {
        if (state.hasError()) return;
        if(!state.getCurrentValue().equals("0")) {
            state.pushCurrentValue();
        }
        Double a = state.popFromStack();
        if(a != null){
            Double b = a * a;
            state.setCurrentValue(b.toString());
            state.pushCurrentValue();
        }
        else {
            state.setError("Erreur");
        }
    }
}
