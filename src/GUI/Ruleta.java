package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Ruleta extends JPanel{
    public JLabel contenedor;
    public SegmetoRueda[] segmentRuedas;
    public BufferedImage img;
    public Ruleta(){
        RuletaPiezas modelo = new RuletaPiezas();
        segmentRuedas = modelo.getSegmentosRuedas();
        img = crearImgRuleta();
        contenedor = new JLabel(new ImageIcon(img));
        add(contenedor);
    }

    private BufferedImage crearImgRuleta(){
        BufferedImage imagen = new BufferedImage(400, 305, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) imagen.getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setColor(new Color(93, 63, 3));
        g2d.fillRect(0, 0, imagen.getWidth(), imagen.getHeight());

        pintarSegmentoRueda(g2d);

        g2d.setColor(new Color(59, 49, 20));
        g2d.setStroke(new BasicStroke(5f));
        g2d.fillOval(120, 75, 158, 158);

        g2d.setColor(new Color(101, 77, 28));
        g2d.setStroke(new BasicStroke(9f));
        g2d.drawOval(50, 3, 300, 300);
        g2d.setStroke(new BasicStroke(5f));
        g2d.drawOval(80, 35, 242, 242);
        g2d.setStroke(new BasicStroke(13f));
        g2d.drawOval(120, 75, 162, 162);

        g2d.dispose();
        return imagen;
    }

    private void pintarSegmentoRueda(Graphics2D g2d){

    }

}
