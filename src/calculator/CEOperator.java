package calculator;


public class CEOperator extends Operator {
    public CEOperator(State state) {
        super(state);
    }

    @Override
    public void execute() {
        if(state.hasError()){
            state.resetError();
        }
        state.clearCurrentValue();
    }
}
