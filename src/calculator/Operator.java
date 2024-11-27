/**
 * La classe abstraite {@code Operator} représente un opérateur qui interagit avec un état
 * donné pour effectuer une opération spécifique. Elle est destinée à être étendue par des
 * sous-classes qui définiront des opérations particulières.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package calculator;

abstract class Operator {

    /**
     * L'état dans lequel l'opérateur va être exécuté.
     */
    protected State state;

    /**
     * Constructeur de la classe {@code Operator}.
     *
     * @param state L'état dans lequel l'opérateur sera exécuté.
     */
    public Operator(State state) {
        this.state = state;
    }

    /**
     * Méthode abstraite qui doit être implémentée dans les sous-classes pour exécuter
     * l'opération spécifique de l'opérateur.
     */
    abstract void execute();
}
