package GUI2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Ruleta extends JPanel {
    private BufferedImage img;
    private Timer tiempo;
    private int vueltas = 0;
    private double angulo = 0;
    public Ruleta(){
        setPreferredSize(new Dimension(300,150));
        try {
            img = ImageIO.read(new File("C://Users//asus//OneDrive//Escritorio//Juego-Ruleta//src//GUI2//img//Ruuleta.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        tiempo = new Timer(6,e ->{
            angulo += 1;
            if(angulo >= 360){
                angulo-=360;
                vueltas++;
            }
            repaint();
        });
        tiempo.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            Graphics2D g2d = (Graphics2D) g.create();

            int cx = getWidth() / 2;
            int cy = getHeight() / 2;

            g2d.translate(cx, cy);
            g2d.rotate(Math.toRadians(angulo));
            g2d.drawImage(img, -getWidth()/2, -getHeight()/2,getWidth(),getHeight(), this);

            g2d.dispose();
        }
    }



}
