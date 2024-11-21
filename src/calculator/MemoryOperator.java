package calculator;

public class MemoryOperator extends Operator {
    private Double memory;

    public MemoryOperator() {}
    @Override
    void execute() {
    }

    public Double getMemory() {
        return memory;
    }
    public void setMemory(Double memory) {
        this.memory = memory;
    }
}
