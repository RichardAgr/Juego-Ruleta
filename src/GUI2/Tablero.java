package GUI2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tablero extends JPanel {
    private BufferedImage imagenDeFondo;
    private Image imagenRedimencionada;

    public Tablero(){
        try {
            imagenDeFondo = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//tableroR.png"));

        }catch (IOException E){
            E.printStackTrace();
        }
        this.setPreferredSize(new Dimension(750,45));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenDeFondo != null) {
            imagenRedimencionada = imagenDeFondo.getScaledInstance(900,400,Image.SCALE_SMOOTH);
            g.drawImage(imagenRedimencionada, 0, 0,this);
        }
    }


}
