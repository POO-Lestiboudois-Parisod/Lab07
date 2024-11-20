package calculator;

public class COperator extends CEOperator {

    public COperator() {}
    @Override
    void execute() {
        super.execute();
        state.clearStack();
    }
}
