/**
 * Représente un opérateur "MR" (Memory Recall) dans une calculatrice.
 * Permet de rappeler une valeur stockée en mémoire dans la valeur courante.
 *
 * @Author :  Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class MROperator extends Operator {

    /**
     * Crée un opérateur MR associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
    public MROperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération MR, en remplaçant la valeur courante par la valeur en mémoire.
     * Si aucune mémoire n'est définie, l'opération est ignorée.
     */
    @Override
    public void execute() {
        System.out.println("currentValue in MR" + state.getCurrentValue() + " memory="+ (state.getMemory() == null));
        if(state.getMemory() == null) {
            return;
        }
        state.setCurrentValue(state.getMemory().toString());
        System.out.println("currentValue in MR" + state.getCurrentValue());
        //est-ce qu'il faut reset la mémoire? non
        //est-ce que la valeur est directement push dans la stack? ???
    }
}
