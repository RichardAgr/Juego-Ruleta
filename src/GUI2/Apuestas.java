package GUI2;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Apuestas extends JPanel {
    private GridBagConstraints gbc;
    public Apuestas(){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        setPreferredSize(new Dimension(200,80));
        ponerBotones();
    }

    private String[] nomApuesetas(){
        String[] botonApuesta = new String[10];
        botonApuesta[0]="Bet on number";
        botonApuesta[1]="Bet on color";
        botonApuesta[2]="Bet on parity";
        botonApuesta[3]="Bet on 18";
        botonApuesta[4]="Corner bet";
        botonApuesta[5]="Split bet";
        botonApuesta[6]="Bet on column";
        botonApuesta[7]="Bet on dozen";
        botonApuesta[8]="Bet on 2 colum";
        botonApuesta[9]="Street bet";
        return botonApuesta;
    }

    private void ponerBotones(){
        Font nuevaTipografia = new Font("Arial", Font.BOLD, 16);
        String[] botonApuesta = nomApuesetas();
        JButton[] botones = new JButton[10];

        for(int i=0;i<10;i++){
            JButton boton = new JButton(botonApuesta[i]);
            boton.setMargin(new Insets(0,0 , 0, 0));
            boton.setBorder(new EmptyBorder(0, 0, 0, 0));
            boton.setFont(nuevaTipografia);
            boton.setPreferredSize(new Dimension(130,35));
            botones[i] = boton;
        }

        for (int i = 0; i < 10; i++) {
            gbc.gridx = i % 2;
            gbc.gridy = i / 2;
            add(botones[i], gbc);
        }
    }

}
