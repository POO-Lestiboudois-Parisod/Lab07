package calculator;

public class EnterOperator extends Operator {
   public EnterOperator() {}

    @Override
    public void execute() {
        state.pushCurrentValue();
    }
}
