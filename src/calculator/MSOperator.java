/**
 * Représente un opérateur "MS" (Memory Store) dans une calculatrice.
 * Permet de sauvegarder la valeur courante dans la mémoire.
 *
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */

package calculator;

public class MSOperator extends Operator {

    /**
     * Crée un opérateur MS associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
    public MSOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération MS, en sauvegardant la valeur courante dans la mémoire.
     */
    @Override
    public void execute() {
        state.setMemory(Double.parseDouble(state.getCurrentValue()));
        System.out.println("enregistré: "+ state.getMemory());

    }
}
