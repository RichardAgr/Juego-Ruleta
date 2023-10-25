package GUI2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PlayGame extends JPanel{
    private GridBagConstraints gbc;

    public PlayGame(){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        ponerBotones();

    }

    private void ponerBotones(){
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(button1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(button2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(button3, gbc);

    }

}
