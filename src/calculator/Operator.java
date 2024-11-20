package calculator;

abstract class Operator
{
  private State state;
  abstract void execute();
}
