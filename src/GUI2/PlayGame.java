package GUI2;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;

public class PlayGame extends JPanel{
    private GridBagConstraints gbc;
    private Image img;

    public PlayGame(){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        setPreferredSize(new Dimension(200,80));
        try {
            img = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//play.png"));
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

    private void ponerBotones(){

        Font nuevaTipografia = new Font("Arial", Font.BOLD, 16);
        JButton boton1 = new JButton("Gira Ruleta");
        boton1.setPreferredSize(new Dimension(160,35));
        boton1.setMargin(new Insets(0, 0, 0, 0));
        boton1.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton1.setBackground(new Color(41, 68, 31));
        boton1.setFont(nuevaTipografia);
        boton1.setForeground(Color.WHITE);

        JButton boton2 = new JButton("Jugador");
        boton2.setPreferredSize(new Dimension(160,35));
        boton2.setMargin(new Insets(0, 0, 0, 0));
        boton2.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton2.setBackground(new Color(41, 68, 31));
        boton2.setFont(nuevaTipografia);
        boton2.setForeground(Color.WHITE);

        JButton boton3 = new JButton("Instruccion apuestas");
        boton3.setPreferredSize(new Dimension(160,35));
        boton3.setMargin(new Insets(0, 0, 0, 0));
        boton3.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton3.setBackground(new Color(41, 68, 31));
        boton3.setFont(nuevaTipografia);
        boton3.setForeground(Color.WHITE);

        gbc.insets = new Insets(5,5,5,5);

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
