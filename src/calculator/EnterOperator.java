/**
 * Représente un opérateur "Enter" dans une calculatrice.
 * Cet opérateur permet d'ajouter la valeur courante dans la pile.
 *
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class EnterOperator extends Operator {

    /**
     * Crée un opérateur Enter associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
   public EnterOperator(State state) {
       super(state);
   }

    /**
     * Exécute l'opération Enter, en ajoutant la valeur courante dans la pile.
     */
    @Override
    public void execute() {
        state.pushCurrentValue();
    }
}
