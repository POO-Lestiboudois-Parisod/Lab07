package calculator;

abstract class Operator
{
  protected State state;
  abstract void execute();
}
