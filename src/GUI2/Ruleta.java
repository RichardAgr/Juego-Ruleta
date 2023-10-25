package GUI2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Ruleta extends JPanel {
    private Image img;
    public Ruleta(){
        setPreferredSize(new Dimension(300,150));
        try {
            img = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//Ruuleta.png"));
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
