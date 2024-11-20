package calculator;


public class CEOperator extends Operator {
    public CEOperator() {

    }

    @Override
    void execute() {
        if(state.hasError()){
            state.resetError();
        }
        state.clearCurrentValue();
    }
}
