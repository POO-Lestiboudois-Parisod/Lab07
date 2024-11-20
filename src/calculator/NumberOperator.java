package calculator;

public class NumberOperator extends Operator{
    private final int value;

    public NumberOperator(int value){
        this.value = value;
    }

    @Override
    public void execute(){
        state.appendToCurrentValue((char)value);
    }
}
