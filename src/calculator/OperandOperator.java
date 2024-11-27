/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class OperandOperator extends Operator {
    private final Operation<Double> operand;
    public OperandOperator(Operation<Double> operand, State state) {
        super(state);
        this.operand = operand;
    }
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

