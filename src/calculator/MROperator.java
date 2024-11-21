package calculator;

public class MROperator extends MemoryOperator {

    public MROperator() {}

    @Override
    void execute() {
        state.setCurrentValue(super.getMemory().toString());
        //est-ce qu'il faut reset la mémoire?
        //est-ce que la valeur est directement push dans la stack?
    }
}
