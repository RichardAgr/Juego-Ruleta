package GUI2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tablero extends JPanel {
    //imagenDeFondo = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//tableroR.png"))
    private Image img;
    public Tablero(){
        setPreferredSize(new Dimension(600,50));
        try {
            img = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//tableroR.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
