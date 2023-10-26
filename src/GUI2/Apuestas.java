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
    private Image img;
    private ApuestaListener apuestaListener;
    public Apuestas(){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        setPreferredSize(new Dimension(300,30));
        try {
            img = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//apuestas.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ponerBotones();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
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
        botonApuesta[8]="Bet on 2 column";
        botonApuesta[9]="Street bet";
        return botonApuesta;
    }

    private void ponerBotones(){
        Font nuevaTipografia = new Font("Arial", Font.BOLD, 16);
        String[] botonApuesta = nomApuesetas();
        JButton[] botones = new JButton[10];

        for(int i=0;i<10;i++){
            final int index = i;
            JButton boton = new JButton(botonApuesta[i]);
            boton.setMargin(new Insets(0,0 , 0, 0));
            boton.setBorder(new EmptyBorder(0, 0, 0, 0));
            boton.setBackground(new Color(41, 68, 31));
            boton.setFont(nuevaTipografia);
            boton.setForeground(Color.WHITE);
            boton.setPreferredSize(new Dimension(130,35));
            boton.addActionListener(e -> {
                if (apuestaListener != null) apuestaListener.realizarApuesta(botonApuesta[index]);
            });
            botones[i] = boton;
        }

        for (int i = 0; i < 10; i++) {
            gbc.insets = new Insets(5,5,5,5);
            gbc.gridx = i % 2;
            gbc.gridy = i / 2;
            add(botones[i], gbc);
        }
    }

    public void setApuestaListener(ApuestaListener listener){
        this.apuestaListener = listener;
    }

}
