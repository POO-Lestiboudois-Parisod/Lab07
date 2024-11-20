package calculator;

public class Subtraction  extends Operation<Double>{
    @Override
    public Double apply(Double a, Double b) {
        return a-b;
    }
}
