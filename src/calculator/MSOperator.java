package calculator;

public class MSOperator extends MemoryOperator {

    public MSOperator() {}
    @Override
    void execute() {
        super.setMemory(Double.parseDouble(state.getCurrentValue()));
        //state.clearCurrentValue();

    }
}
