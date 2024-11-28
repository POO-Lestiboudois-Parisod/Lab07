// TestUtils.java
package test;

import calculator.JCalculator;

import javax.swing.*;
import java.awt.*;

public class JCalculatorTestUtils {

    // Méthode pour obtenir un bouton par son étiquette
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

    // Méthode pour obtenir un composant par son nom
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

    // Méthode utilitaire pour simuler un clic sur un bouton
    public static void clickButton(JCalculator calculator, String label) {
        JButton button = getButtonByLabel(calculator, label);
        if (button == null) throw new IllegalArgumentException("Bouton non trouvé : " + label);
        button.doClick();
    }

    // Méthode utilitaire pour obtenir la valeur affichée
    public static String getDisplayValue(JCalculator calculator) {
        JTextField displayField = (JTextField) getComponentByName(calculator, "jNumber");
        if (displayField == null) throw new IllegalStateException("Champ d'affichage introuvable");
        return displayField.getText();
    }

    // Méthode utilitaire pour obtenir le contenu de la pile
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