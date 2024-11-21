package calculator;

public class BackspaceOperator extends Operator {
    public BackspaceOperator() {

    }

    @Override
    public void execute() {
       state.backspace();
    }
}
