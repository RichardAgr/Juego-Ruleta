package GUI2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PlayGame extends JPanel{
    private JPanel contenedorPlay;
    private GridBagConstraints gbc = new GridBagConstraints();
    public PlayGame(){
        contenedorPlay = new JPanel();
        contenedorPlay.setLayout(new GridBagLayout());
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        botonesJuego();
        add(contenedorPlay);
    }

    private void botonesJuego(){
        Font nuevaTipografia = new Font("Arial", Font.BOLD, 16);

        JButton boton1 = new JButton("Girar Ruleta");
        JButton boton2 = new JButton("Jugador");
        JButton boton3 = new JButton("Ganacian por \n apuesta");

        boton1.setPreferredSize(new java.awt.Dimension(150, 30));
        boton1.setMargin(new Insets(0, 0, 0, 0));
        boton1.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton1.setFont(nuevaTipografia);
        boton2.setPreferredSize(new java.awt.Dimension(150, 30));
        boton3.setPreferredSize(new java.awt.Dimension(150, 30));

        gbc.anchor = GridBagConstraints.CENTER;
        contenedorPlay.add(boton1,gbc);
        contenedorPlay.add(boton2,gbc);
        contenedorPlay.add(boton3,gbc);
    }
}
