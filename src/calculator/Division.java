package calculator;

public class Division extends Operation<Double>{
    @Override
    public Double apply(Double a, Double b) {
        if(b!=0) {
            return a / b;
        }
        else {
            throw new ArithmeticException();
        }
    }
}
