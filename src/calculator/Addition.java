/**
 * Représente une opération d'addition dans une calculatrice.
 * Hérite de la classe abstraite {@code Operation} paramétrée par le type {@code Double}.
 *
 * @param <Double> Le type des opérandes et du résultat de l'opération.
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;


public class Addition extends Operation<Double> {

    /**
     * Applique l'opération d'addition sur deux nombres de type {@code Double}.
     *
     * @param a Le premier opérande.
     * @param b Le second opérande.
     * @return La somme des deux opérandes {@code a + b}.
     */
    @Override
    public Double apply(Double a, Double b) {
        return a + b;
    }
}
