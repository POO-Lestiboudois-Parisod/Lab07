/**
 * La classe abstraite {@code Operation} définit une opération générique qui peut être
 * appliquée sur deux valeurs de type {@code T}.
 *
 * @param <T> Le type des valeurs sur lesquelles l'opération sera effectuée.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

public abstract class Operation<T> {

    /**
     * Applique l'opération sur deux valeurs de type {@code T}.
     *
     * @param a La première valeur de l'opération.
     * @param b La deuxième valeur de l'opération.
     * @return Le résultat de l'opération, de type {@code T}.
     */
    public abstract T apply(T a, T b);
}
