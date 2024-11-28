/**
 * Classe utilitaire pour tester la calculatrice graphique JCalculator.
 * Contient des méthodes pour simuler des clics sur les boutons, récupérer des composants
 * et obtenir les informations affichées ou stockées dans la pile.
 *
 * @Author : Maxime Lestiboudois
 * @Author : Nathan Parisod
 * @date : 27/11/2024
 */
package test;

import calculator.JCalculator;

import javax.swing.*;
import java.awt.*;

public class JCalculatorTestUtils {

    /**
     * Récupère un bouton par son étiquette dans le conteneur donné.
     * @param container le conteneur où chercher le bouton.
     * @param label l'étiquette du bouton recherché.
     * @return le bouton correspondant, ou null si aucun bouton n'est trouvé.
     */
    public static JButton getButtonByLabel(Container container, String label) {
        for (Component component : container.getComponents()) {
            if (component instanceof JButton button) {
                if (button.getText().equals(label)) {
                    return button;
                }
            } else if (component instanceof Container) {
                JButton button = getButtonByLabel((Container) component, label);
                if (button != null) {
                    return button;
                }
            }
        }
        return null;
    }

    /**
     * Récupère un composant par son nom dans le conteneur donné.
     * @param container le conteneur où chercher le composant.
     * @param name le nom du composant recherché.
     * @return le composant correspondant, ou null si aucun composant n'est trouvé.
     */
    public static Component getComponentByName(Container container, String name) {
        for (Component component : container.getComponents()) {
            if (name.equals(component.getName())) {
                return component;
            } else if (component instanceof Container) {
                Component child = getComponentByName((Container) component, name);
                if (child != null) {
                    return child;
                }
            }
        }
        return null;
    }

    /**
     * Simule un clic sur un bouton d'une calculatrice.
     * @param calculator l'instance de la calculatrice.
     * @param label l'étiquette du bouton à cliquer.
     * @throws IllegalArgumentException si le bouton n'est pas trouvé.
     */
    public static void clickButton(JCalculator calculator, String label) {
        JButton button = getButtonByLabel(calculator, label);
        if (button == null) throw new IllegalArgumentException("Bouton non trouvé : " + label);
        button.doClick();
    }

    /**
     * Récupère la valeur affichée sur l'écran de la calculatrice.
     * @param calculator l'instance de la calculatrice.
     * @return la valeur affichée sous forme de chaîne de caractères.
     * @throws IllegalStateException si le champ d'affichage n'est pas trouvé.
     */
    public static String getDisplayValue(JCalculator calculator) {
        JTextField displayField = (JTextField) getComponentByName(calculator, "jNumber");
        if (displayField == null) throw new IllegalStateException("Champ d'affichage introuvable");
        return displayField.getText();
    }

    /**
     * Récupère le contenu de la pile de la calculatrice.
     * @param calculator l'instance de la calculatrice.
     * @return un tableau de chaînes contenant les éléments de la pile.
     * @throws IllegalStateException si la pile n'est pas trouvée.
     */
    public static String[] getStackContents(JCalculator calculator) {
        JList<String> stackList = (JList<String>) getComponentByName(calculator, "jStack");
        if (stackList == null) throw new IllegalStateException("Pile introuvable");
        ListModel<String> model = stackList.getModel();
        String[] stackContents = new String[model.getSize()];
        for (int i = 0; i < model.getSize(); i++) {
            stackContents[i] = model.getElementAt(i);
        }
        return stackContents;
    }
}
