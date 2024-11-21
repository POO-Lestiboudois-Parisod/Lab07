package calculator;

public class PositiveNegativeOperator extends Operator {

    public PositiveNegativeOperator() {}
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
