/**
 * Représente un opérateur de suppression dans une calculatrice.
 * Cet opérateur permet de supprimer le dernier caractère saisi dans l'état actuel.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class BackspaceOperator extends Operator {

    /**
     * Crée un nouvel opérateur de suppression associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
    public BackspaceOperator(State state) {
        super(state);
    }
    /**
     * Exécute l'opération de suppression du dernier caractère dans l'état actuel.
     * Appelle la méthode {@code backspace()} sur l'objet {@code state}.
     */
    @Override
    public void execute() {
       state.backspace();
    }
}
