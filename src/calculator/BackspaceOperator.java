package calculator;

public class BackspaceOperator extends Operator {
    public BackspaceOperator(State state) {
        super(state);
    }

    @Override
    public void execute() {
       state.backspace();
    }
}
