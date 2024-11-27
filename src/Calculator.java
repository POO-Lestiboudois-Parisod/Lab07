import calculator.*;
import util.*;
import java.util.Scanner;
public class Calculator {

    private final State state;
    private final Scanner scanner;

    public Calculator() {
        this.state = new State();
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        boolean stay = true;
        while(stay){
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if(input.equals("exit")){
                break;
            }

            stay = processInput(input);

            displayState();
        }
    }

    private boolean processInput(String input){
        if(isNumber(input)){
            new NumberOperator(Integer.parseInt(input), state).execute();
            new EnterOperator(state).execute();
        }
        else {
            // Si l'entrée est un opérateur, trouver et exécuter l'opération correspondante
            switch (input) {
                case "+":
                    new OperandOperator(new Addition(),state).execute();
                    break;
                case "-":
                    new OperandOperator(new Subtraction(), state).execute();
                    break;
                case "*":
                    new OperandOperator(new Multiplication(), state).execute();
                    break;
                case "/":
                    new OperandOperator(new Division(), state).execute();
                    break;
                case "x^2":
                    new SquareOperator(state).execute();
                    break;
                case "sqrt":
                    new SqrtOperator(state).execute();
                    break;
                case "1/x":
                    new FractionnalOperator(state).execute();
                    break;
                case "c":
                    new COperator(state).execute();
                    break;
                case "exit":
                    return false;
                default:
                    System.out.println("Opérateur inconnu");
                    return false;
            }
        }
        return true;
    }

    private void displayState(){
        if
        (state.hasError()){
            System.out.println("Error");
        }
        else{
            System.out.println(state.getStack().toString());
        }
    }
    private boolean isNumber(String input){
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args){
        new Calculator().start();
    }







}
