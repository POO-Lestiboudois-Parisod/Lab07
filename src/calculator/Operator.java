package calculator;

abstract class Operator {
    protected State state = new State();

    abstract void execute();
}
