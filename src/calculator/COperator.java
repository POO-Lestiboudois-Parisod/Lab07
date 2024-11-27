/**
 * Représente un opérateur "C" (Clear) dans une calculatrice.
 * Hérite de l'opérateur CE, avec une fonctionnalité supplémentaire de vidage de la pile.
 *
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class COperator extends CEOperator {

    /**
     * Crée un opérateur C associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
    public COperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération C. Réinitialise la valeur courante, corrige les erreurs,
     * et vide la pile.
     */
    @Override
    public void execute() {
        super.execute();
        state.clearStack();
    }
}
