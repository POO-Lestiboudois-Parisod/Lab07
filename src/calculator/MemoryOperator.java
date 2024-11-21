package calculator;

public class MemoryOperator extends Operator {
    private Double memory;

    public MemoryOperator(State state) {
        super(state);
    }
    @Override
    public void execute() {
    }

    public Double getMemory() {
        return memory;
    }
    public void setMemory(Double memory) {
        this.memory = memory;
    }
}
