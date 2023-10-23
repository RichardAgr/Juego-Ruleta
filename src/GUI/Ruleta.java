/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

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
        g2d.drawOval(87, 38, 230, 230);
        g2d.setStroke(new BasicStroke(13f));
        g2d.drawOval(120, 75, 162, 162);

        g2d.dispose();
        return imagen;
    }

    private void pintarSegmentoRueda(Graphics2D g2d){
        double anguloIncremental = 360.0 / segmentRuedas.length;
        double angulo = 270.0;
        Point lastInnerPoint = null;
        Point lastOuterPoint = null;
        Point originalInnerPoint = null;
        Point originalOuterPoint = null;
        Point puntoCentro = new Point(200, 150);

        for (int i = 0; i < segmentRuedas.length; i++) {
            Point innerPoint = carteciano(angulo,   80.0, puntoCentro);
            Point outerPoint = carteciano(angulo, 150.0, puntoCentro);
            if (i > 0) {
                dibujarPoligono(g2d, lastInnerPoint, lastOuterPoint, i, innerPoint, outerPoint);
            } else {
                originalInnerPoint = new Point(innerPoint.x, innerPoint.y);
                originalOuterPoint = new Point(outerPoint.x, outerPoint.y);
            }
            angulo += anguloIncremental;
            lastInnerPoint = new Point(innerPoint.x, innerPoint.y);
            lastOuterPoint = new Point(outerPoint.x, outerPoint.y);
        }

        dibujarPoligono(g2d, lastInnerPoint, lastOuterPoint, segmentRuedas.length, originalInnerPoint, originalOuterPoint);

        angulo = anguloIncremental * 0.5;
        for (int i = 0; i < segmentRuedas.length; i++) {
            BufferedImage image = dibujarNumRueda(segmentRuedas[i].getNumeroRueda(), segmentRuedas[i].getColorBack(), angulo);
            double radio = 130.0;
            Point point = carteciano(270.0 + angulo, radio, puntoCentro);
            Point correccion = segmentRuedas[i].getCorrelacionDelta();
            g2d.drawImage(image, point.x - correccion.x, point.y - correccion.y, null);
            angulo += anguloIncremental;
        }

        angulo = 270.0;
        g2d.setStroke(new BasicStroke(3f));
        g2d.setColor(new Color(93, 63, 3));
        for (int i = 0; i <= segmentRuedas.length; i++) {
            Point innerPoint = carteciano(angulo, 85.0, puntoCentro);
            Point outerPoint = carteciano(angulo, 150.0, puntoCentro);
            g2d.drawLine(innerPoint.x, innerPoint.y, outerPoint.x, outerPoint.y);
            angulo += anguloIncremental;
        }
    }

    private BufferedImage dibujarNumRueda(String num, Color backColor, double angulo) {
        Font tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 15);

        BufferedImage dummyImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) dummyImage.getGraphics();
        FontMetrics matriz = g2d.getFontMetrics(tipografia);
        int height = matriz.getAscent();
        int width = matriz.stringWidth(num);
        g2d.dispose();

        BufferedImage image = new BufferedImage(width + 3, height + 3, BufferedImage.TYPE_INT_RGB);
        g2d = (Graphics2D) image.getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setColor(backColor);
        g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
        g2d.setColor(Color.WHITE);
        g2d.setFont(tipografia);
        g2d.drawString(num, 1, image.getHeight() - 5);
        g2d.dispose();

        AffineTransform xfrm = new AffineTransform();
        xfrm = AffineTransform.getRotateInstance(Math.toRadians(angulo),image.getWidth() / 2, image.getHeight() / 2);
        BufferedImageOp op = new AffineTransformOp(xfrm, AffineTransformOp.TYPE_BILINEAR);
        BufferedImage finImg = op.filter(image, null);

        return finImg;
    }



    private Point carteciano(double angulo, double radio, Point puntoCentro) {
        double theta = Math.toRadians(angulo);
        int x = (int) Math.round(Math.cos(theta) * radio) + puntoCentro.x;
        int y = (int) Math.round(Math.sin(theta) * radio) + puntoCentro.y;
        return new Point(x, y);
    }

    private void dibujarPoligono(Graphics2D g2d, Point lastInnerPoint, Point lastOuterPoint, int indice, Point innerPoint, Point outerPoint) {
        Polygon polygon = new Polygon();
        polygon.addPoint(lastInnerPoint.x, lastInnerPoint.y);
        polygon.addPoint(lastOuterPoint.x, lastOuterPoint.y);
        polygon.addPoint(outerPoint.x, outerPoint.y);
        polygon.addPoint(innerPoint.x, innerPoint.y);
        g2d.setColor(segmentRuedas[indice - 1].getColorBack());
        g2d.fillPolygon(polygon);
    }
}
