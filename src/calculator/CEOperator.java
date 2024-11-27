/**
 * Représente un opérateur "CE" (Clear Entry) dans une calculatrice.
 * Cet opérateur permet de réinitialiser la valeur courante et de gérer les erreurs.
 *
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;


public class CEOperator extends Operator {

    /**
     * Crée un opérateur CE associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
    public CEOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération CE. Si une erreur est présente, elle est réinitialisée.
     * Réinitialise également la valeur courante.
     */
    @Override
    public void execute() {
        if(state.hasError()){
            state.resetError();
        }
        state.clearCurrentValue();
    }
}
