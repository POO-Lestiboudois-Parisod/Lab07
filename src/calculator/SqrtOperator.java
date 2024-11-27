/**
 * La classe {@code SqrtOperator} représente un opérateur qui calcule la racine carrée
 * de la valeur actuelle dans l'état. Si la valeur est valide, la racine carrée est
 * calculée et le résultat est stocké dans l'état.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class SqrtOperator extends Operator {

    /**
     * Constructeur de la classe {@code SqrtOperator}.
     *
     * @param state L'état dans lequel la racine carrée sera calculée.
     */
    public SqrtOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération en calculant la racine carrée de la valeur actuelle dans l'état.
     * Si la valeur est valide, la racine carrée est calculée et le résultat est stocké.
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
            Double b = Math.sqrt(a);
            state.setCurrentValue(b.toString());
            state.pushCurrentValue();
        }
        else {
            state.setError("Erreur");
        }
    }
}
