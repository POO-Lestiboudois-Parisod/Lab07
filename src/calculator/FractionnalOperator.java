/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class FractionnalOperator extends Operator {
    public FractionnalOperator(State state) {
        super(state);
    }
    @Override
    public void execute() {
        if (state.hasError()) return;
        if(!state.getCurrentValue().equals("0")) {
            state.pushCurrentValue();
        }
        Double a = state.popFromStack();
        if(a != null){
            Double b = 1/a;
            state.setCurrentValue(b.toString());
            state.pushCurrentValue();
        }
        else {
            state.setError("Erreur d'addition");
        }
    }
}
