/**
 * Représente un opérateur de conversion en fraction inverse (1/x) dans une calculatrice.
 * Si aucune erreur n'est présente, il calcule l'inverse de la valeur courante.
 *
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public class FractionnalOperator extends Operator {

    /**
     * Crée un opérateur de fraction associé à un état donné.
     *
     * @param state L'état de la calculatrice sur lequel l'opérateur doit agir.
     */
    public FractionnalOperator(State state) {
        super(state);
    }

    /**
     * Exécute l'opération fraction inverse (1/x).
     * Si la valeur courante est différente de zéro, calcule et met à jour l'état.
     * Gère les erreurs en cas de division par zéro ou de pile vide.
     */
    @Override
    public void execute() {
        if (state.hasError()) return;
        if(!state.getCurrentValue().equals("0")) {
            state.pushCurrentValue();
        }
        Double a = state.popFromStack();
        if(a != null){
            Double b = 1/a;
            state.setCurrentValue(b.toString());
            state.pushCurrentValue();
        }
        else {
            state.setError("Erreur d'addition");
        }
    }
}
