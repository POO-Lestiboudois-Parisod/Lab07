package calculator;

public class SqrtOperator extends Operator {
    public SqrtOperator() {}
    @Override
    void execute() {
        if (state.hasError()) return;
        Double a = state.popFromStack();
        if(a != null){
            Double b = Math.sqrt(a);
            state.setCurrentValue(b.toString());
            state.pushCurrentValue();
        }
        else {
            state.setError("Erreur d'addition");
        }
    }
}
