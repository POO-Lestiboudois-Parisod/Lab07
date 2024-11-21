package calculator;

public class MSOperator extends MemoryOperator {

    public MSOperator() {}
    @Override
    public void execute() {
        super.setMemory(Double.parseDouble(state.getCurrentValue()));
        //state.clearCurrentValue();

    }
}
