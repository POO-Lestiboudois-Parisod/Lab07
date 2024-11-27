/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class COperator extends CEOperator {

    public COperator(State state) {
        super(state);
    }
    @Override
    public void execute() {
        super.execute();
        state.clearStack();
    }
}
