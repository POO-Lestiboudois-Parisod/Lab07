/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class PositiveNegativeOperator extends Operator {

    public PositiveNegativeOperator(State state) {
        super(state);
    }
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
