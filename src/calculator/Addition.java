/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public class Addition extends Operation<Double>{
    @Override
    public Double apply(Double a, Double b) {
        return a+b;
    }
}
