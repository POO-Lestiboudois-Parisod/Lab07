package calculator;

public class MROperator extends Operator {

    public MROperator(State state) {
        super(state);
    }

    @Override
    public void execute() {
        System.out.println("currentValue in MR" + state.getCurrentValue() + " memory="+ (state.getMemory() == null));
        if(state.getMemory() == null) {
            return;
        }
        state.setCurrentValue(state.getMemory().toString());
        System.out.println("currentValue in MR" + state.getCurrentValue());
        //est-ce qu'il faut reset la mémoire? non
        //est-ce que la valeur est directement push dans la stack? ???
    }
}
