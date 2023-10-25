package GUI2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PlayGame extends JPanel{
    private GridBagConstraints gbc;

    public PlayGame(){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        setPreferredSize(new Dimension(200,80));
        ponerBotones();

    }

    private void ponerBotones(){

        Font nuevaTipografia = new Font("Arial", Font.BOLD, 16);
        JButton boton1 = new JButton("Gira Ruleta");
        boton1.setPreferredSize(new Dimension(160,35));
        boton1.setMargin(new Insets(0, 0, 0, 0));
        boton1.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton1.setFont(nuevaTipografia);

        JButton boton2 = new JButton("Jugador");
        boton2.setPreferredSize(new Dimension(160,35));
        boton2.setMargin(new Insets(0, 0, 0, 0));
        boton2.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton2.setFont(nuevaTipografia);

        JButton boton3 = new JButton("Instruccion apuestas");
        boton3.setPreferredSize(new Dimension(160,35));
        boton3.setMargin(new Insets(0, 0, 0, 0));
        boton3.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton3.setFont(nuevaTipografia);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(boton1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(boton2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(boton3, gbc);

    }

}
