/**
 * Représente une opération de division dans une calculatrice.
 * Hérite de la classe abstraite {@code Operation} paramétrée par le type {@code Double}.
 *
 * @param <Double> Le type des opérandes et du résultat de l'opération.
 *
 * @Author :  Maxime Lestiboudois
 * @Author :  Nathan Parisod
 * @date : 27/11/2024
 */

package calculator;

public class Division extends Operation<Double>{

    /**
     * Applique l'opération de division sur deux nombres de type {@code Double}.
     *
     * @param a Le numérateur.
     * @param b Le dénominateur.
     * @return Le quotient de la division {@code a / b}.
     * @throws ArithmeticException Si le dénominateur est égal à zéro.
     */
    @Override
    public Double apply(Double a, Double b) {
        if(b!=0) {
            return a / b;
        }
        else {
            throw new ArithmeticException();
        }
    }
}
