/**
 * La classe {@code OperandOperator} représente un opérateur qui effectue une opération
 * entre deux opérandes, extraits de la pile de l'état actuel.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class OperandOperator extends Operator {

    /**
     * L'opération à appliquer sur les deux opérandes (de type {@code Double}).
     */
    private final Operation<Double> operand;

    /**
     * Constructeur de la classe {@code OperandOperator}.
     *
     * @param operand L'opération à effectuer sur les deux opérandes.
     * @param state L'état dans lequel l'opération sera exécutée.
     */
    public OperandOperator(Operation<Double> operand, State state) {
        super(state);
        this.operand = operand;
    }

    /**
     * Exécute l'opération entre les deux derniers opérandes extraits de la pile.
     * Si les opérandes sont valides, l'opération est appliquée et le résultat est
     * stocké dans l'état. Si une erreur survient (par exemple si l'un des opérandes est nul),
     * un message d'erreur est défini dans l'état.
     */
    @Override
    public void execute() {
        if (state.hasError()) return;
        if(!state.getCurrentValue().equals("0")) {
            state.pushCurrentValue();
        }
        Double b = state.popFromStack();
        Double a = state.popFromStack();
        if (a != null && b != null) {
            state.setCurrentValue(operand.apply(a, b).toString());
            state.pushCurrentValue();
        } else {
            state.setError("Erreur");
        }
    }
}
