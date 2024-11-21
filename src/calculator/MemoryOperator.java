package calculator;

public class MemoryOperator extends Operator {
    private Double memory;

    public MemoryOperator() {}
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
