package calculator;

public class SquareOperator extends Operator {
    public SquareOperator(State state) {
        super(state);
    }
    @Override
    public void execute() {
        if (state.hasError()) return;
        Double a = state.popFromStack();
        if(a != null){
            Double b = a*a;
            state.setCurrentValue(b.toString());
            state.pushCurrentValue();
        }
        else {
            state.setError("Erreur");
        }
    }

}
