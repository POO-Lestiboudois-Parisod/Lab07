/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class MSOperator extends Operator {

    public MSOperator(State state) {
        super(state);
    }
    @Override
    public void execute() {
        state.setMemory(Double.parseDouble(state.getCurrentValue()));
        System.out.println("enregistré: "+ state.getMemory());
        //state.clearCurrentValue();

    }
}
