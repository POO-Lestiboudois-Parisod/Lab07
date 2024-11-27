/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class EnterOperator extends Operator {
   public EnterOperator(State state) {
       super(state);
   }

    @Override
    public void execute() {
        state.pushCurrentValue();
    }
}
