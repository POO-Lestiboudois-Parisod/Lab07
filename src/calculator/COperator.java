package calculator;

public class COperator extends CEOperator {

    public COperator() {}
    @Override
    public void execute() {
        super.execute();
        state.clearStack();
    }
}
