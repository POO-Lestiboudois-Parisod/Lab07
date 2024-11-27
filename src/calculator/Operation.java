/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

public abstract class Operation<T> {

    public abstract T apply(T a, T b);
}
