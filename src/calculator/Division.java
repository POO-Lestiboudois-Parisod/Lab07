package calculator;

public class Division extends Operation{
    @Override
    public int apply(int a, int b) {
        if(b!=0) {
            return a / b;
        }
        else {
            throw new ArithmeticException();
        }
    }
}
