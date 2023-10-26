package GUI2;

import logica.Color;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;

public class CustomInputDialogPanel extends JPanel {
    private JFormattedTextField textField1;
    private JFormattedTextField textField2;
    private JFormattedTextField textField3;
    private JCheckBox booleanField1;
    private JCheckBox booleanField2;
    private JCheckBox booleanField3;
    private JComboBox<Color> colorJComboBox;

    public CustomInputDialogPanel(String tipoApuesta) {
        setLayout(new GridLayout(4,2));

        JLabel label3 = new JLabel("Money bet");
        add(label3);

        textField3 = createFormattedTextField(Integer.MAX_VALUE);
        add(textField3);

        selectTipoDeApuesta(tipoApuesta);

    }

    private void only2TextField(String campo1, String campo2) {
        JLabel label1 = new JLabel(campo1);
        add(label1);

        textField1 = createFormattedTextField(36);
        add(textField1);

        JLabel label2 = new JLabel(campo2);
        add(label2);

        textField2 = createFormattedTextField(36);
        add(textField2);
    }

    private void only1TextField(String campo1) {
        JLabel label1 = new JLabel(campo1);
        add(label1);

        textField1 = createFormattedTextField(36);
        add(textField1);
    }

    private void only1BooleanField(String campo1) {
        booleanField1 = new JCheckBox(campo1);
        add(booleanField1);
    }

    private void only2BooleanField(String campo1, String campo2) {
        booleanField1 = new JCheckBox(campo1);
        add(booleanField1);

        booleanField2 = new JCheckBox(campo2);
        add(booleanField2);
    }

    private void only3BooleanField(String campo1, String campo2, String campo3) {
        booleanField1 = new JCheckBox(campo1);
        add(booleanField1);

        booleanField2 = new JCheckBox(campo2);
        add(booleanField2);

        booleanField3 = new JCheckBox(campo3);
        add(booleanField3);
    }
    private void only1ComboBox(String campo1) {
        JLabel label4 = new JLabel("campo1");
        add(label4);

        // Crea un JComboBox con las opciones del enum TipoApuesta
        colorJComboBox = new JComboBox<>(Color.values());
        add(colorJComboBox);
    }

    private void selectTipoDeApuesta(String tipoApuesta) {
        switch (tipoApuesta) {
            case "Bet on number":
                only1TextField("Número a apostar");
                break;
            case "Bet on color":
                only1ComboBox("Color a apostar");
                break;
            case "Bet on parity":
                only1BooleanField("Es una apuesta par?");
                break;
            case "Bet on 18":
                only1BooleanField("Es una apuesta a los primeros 18?");
                break;
            case "Corner bet":
                only2TextField("Esquina 1", "Esquina 2");
                break;
            case "Split bet":
                only2TextField("Número 1", "Número 2");
                break;
            case "Bet on column":
                only1TextField("Columna a apostar");
                break;
            case "Bet on dozen":
                only3BooleanField("docena 1", "docena 2", "docena 3");
                break;
            case "Bet on 2 column":
                only2TextField("columna 1", "columna 2");
                break;
            case "Street bet":
                only2TextField("Esquina 1", "Esquina 2");
                break;

            default:
                System.out.println("Apuesta no reconocida");
                break;
        }

    }

    private JFormattedTextField createFormattedTextField(int maxValue) {
        NumberFormatter formatter = new NumberFormatter();
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0); // You can set minimum and maximum values if needed
        formatter.setMaximum(maxValue);
        formatter.setAllowsInvalid(false); // Disallow invalid input

        JFormattedTextField formattedTextField = new JFormattedTextField(formatter);
        formattedTextField.setColumns(10);

        return formattedTextField;
    }

    public int getTextField1Value() {
        return (int) textField1.getValue();
    }

    public int getTextField2Value() {
        return (int)textField2.getValue();
    }

    public int getTextField3Value() {
        return (int)textField3.getValue();
    }

    public JCheckBox getBooleanField1() {
        return booleanField1;
    }

    public JCheckBox getBooleanField2() {
        return booleanField2;
    }

    public JCheckBox getBooleanField3() {
        return booleanField3;
    }

}
