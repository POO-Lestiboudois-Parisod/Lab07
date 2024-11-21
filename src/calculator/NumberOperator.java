package calculator;

import java.sql.SQLOutput;

public class NumberOperator extends Operator {
    private final int value;

    public NumberOperator(int value) {
        this.value = value;
    }

    @Override
    public void execute() {
        state.appendToCurrentValue((char) (value + 48));    // 48 is the ASCII code for '0'
    }
}
