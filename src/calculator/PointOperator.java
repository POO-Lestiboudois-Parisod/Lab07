package calculator;

public class PointOperator extends Operator {

    public PointOperator() {}
    @Override
    public void execute() {
        state.appendToCurrentValue('.');
    }
}
