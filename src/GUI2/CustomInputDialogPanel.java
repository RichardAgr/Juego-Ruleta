package GUI2;

import javax.swing.*;
import java.awt.*;

public class CustomInputDialogPanel extends JPanel {
    private JTextField textField1;
    private JTextField textField2;

    public CustomInputDialogPanel() {
        setLayout(new GridLayout(2,2));

        JLabel label1 = new JLabel("Campo 1:");
        add(label1);

        textField1 = new JTextField();
        add(textField1);

        JLabel label2 = new JLabel("Campo 2:");
        add(label2);

        textField2 = new JTextField();
        add(textField2);

    }

    public String getTextField1Value() {
        return textField1.getText();
    }

    public String getTextField2Value() {
        return textField2.getText();
    }
}
