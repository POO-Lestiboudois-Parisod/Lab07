/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class PointOperator extends Operator {

    public PointOperator(State state) {
        super(state);
    }
    @Override
    public void execute() {
        state.appendToCurrentValue('.');
    }
}
