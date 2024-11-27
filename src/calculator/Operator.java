/**
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 */

package calculator;

abstract class Operator {
    protected State state;

    public Operator(State state) {
      this.state = state;
    }
    abstract void execute();
}
