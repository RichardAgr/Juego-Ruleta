package GUI;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import GUI.PiezaRuleta;
public class Tablero extends JPanel{
    public JLabel contenedor;
    public int ancho;
    public int  alto;
    public int anchoSegmento;
    public int margen;
    public int margenLinea;
    public Color colorFondo;

    public BufferedImage imagenTabla;
    public Tablero(){
        PiezaRuleta pr = new PiezaRuleta();
        margen = pr.getMargen();
        margenLinea = pr.getMargenLinea();
        anchoSegmento = pr.getAnchoSegmento();
        int padding = (2*margenLinea) +(2*margen);
        ancho = 14 * anchoSegmento + padding;
        alto = 5 * anchoSegmento + padding;
        colorFondo = new Color(14, 73, 23);
        imagenTabla = crearTablero();
        contenedor = new JLabel(new ImageIcon(imagenTabla));
        add(contenedor);
    }

    private BufferedImage crearTablero(){
        BufferedImage img = new BufferedImage(alto,ancho,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) img.getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setColor(colorFondo);
        g2d.fillRect(0,0,img.getWidth(),img.getHeight());

        dibujarNumeros(g2d);
        dibujarLineasHorizontales(g2d);
        dibujarLinearVerticales(g2d);


        g2d.dispose();

        BufferedImage imgRotar = rotarImg(img);
        g2d = (Graphics2D) imgRotar.getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);

        dibujarApuestas(g2d);
        g2d.dispose();
        return imgRotar;
    }

    private void dibujarNumeros(Graphics2D g2d){
        Font tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 30);
        g2d.setFont(tipografia);

        dibujarNumero(g2d, "", 0, 234, 18,2 * anchoSegmento / 2 , anchoSegmento);
        dibujarNumero(g2d, "", 0, 126, 18, 2 * anchoSegmento / 2, anchoSegmento);

        String num = "0";
        int segCero = 2 * anchoSegmento / 2;
        int x = 2 * anchoSegmento + margen + margenLinea + segCero;
        int y = margen + margenLinea;

        dibujarNumero(g2d, num, 0, x, y, segCero, anchoSegmento);

        int numTabla = 1;
        y = anchoSegmento + margen + margenLinea;
        for (int fila = 0; fila < 12; fila++) {
            x = anchoSegmento + margen + margenLinea;
            for (int columna = 0; columna < 3; columna++) {
                x += anchoSegmento;
                num = Integer.toString(numTabla);
                dibujarNumero(g2d, num, numTabla++, x, y, anchoSegmento, anchoSegmento);
            }
            y += anchoSegmento;
        }

        String text = "3 for 1";
        tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 16);
        g2d.setFont(tipografia);
        x = anchoSegmento + margen + margenLinea;
        for (int columna = 0; columna < 3; columna++) {
            x += anchoSegmento;
            dibujarTexto(g2d, text, x, y, anchoSegmento, anchoSegmento);
        }
    }

    private void dibujarTexto(Graphics2D g2d, String text,int x, int y, int anchoSeg, int altoSeg) {
        FontMetrics matriz = g2d.getFontMetrics(g2d.getFont());
        int ascender = matriz.getAscent();
        int anchor = matriz.stringWidth(text);

        x += (anchoSeg - anchor) / 2;
        y += (altoSeg - ascender) / 2 + ascender;

        g2d.setColor(Color.WHITE);
        g2d.drawString(text, x, y);
    }

    private void dibujarNumero(Graphics2D g2d,String num,int numero, int x,int y, int anchoSeg, int altoSeg){
        FontMetrics matriz = g2d.getFontMetrics(g2d.getFont());
        int ascender = matriz.getAscent();

        int anchor = matriz.stringWidth(num);
        if (numero == 0) {
            g2d.setColor(new Color(29, 227, 45));
        } else if ((numero > 0 && numero < 11) || (numero > 18 && numero < 29)) {
            if(numero%2==0){
                g2d.setColor(new Color(9, 9, 9));
            }else{
                g2d.setColor(new Color(252, 3, 3));
            }
        } else if ((numero > 10 && numero < 19) || (numero > 28 && numero < 37)) {
            if(numero%2==0){
                g2d.setColor(new Color(252, 3, 3));
            }else{
                g2d.setColor(new Color(9, 9, 9));
            }
        }
        g2d.fillRect(x,y,anchoSeg,altoSeg);

        x += (anchoSeg - anchor) / 2;
        y += (altoSeg - ascender) / 2 + ascender;

        g2d.setColor(Color.WHITE);
        g2d.drawString(num, x, y);
    }

    private void dibujarLineasHorizontales(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(5f));
        g2d.setColor(Color.WHITE);

        int y = margen + margenLinea;
        segmetoHorizontal(g2d, 2, 5, y);
        y = dibujarBloqueVer(g2d, y);
        y = dibujarBloqueVer(g2d, y);
        y = dibujarBloqueVer(g2d, y);
        segmetoHorizontal(g2d, 2, 5, y);
        y += anchoSegmento;
        segmetoHorizontal(g2d, 0, 5, y);
        y += anchoSegmento;
        segmetoHorizontal(g2d, 2, 5, y);
    }

    private int dibujarBloqueVer(Graphics2D g2d, int y) {
        y += anchoSegmento;
        segmetoHorizontal(g2d, 0, 5, y);
        y += anchoSegmento;
        segmetoHorizontal(g2d, 2, 5, y);
        y += anchoSegmento;
        segmetoHorizontal(g2d, 0, 1, y);
        segmetoHorizontal(g2d, 2, 5, y);
        y += anchoSegmento;
        segmetoHorizontal(g2d, 2, 5, y);
        return y;
    }

    private void segmetoHorizontal(Graphics2D g2d, int c1, int c2, int y) {
        int x1 = c1 * anchoSegmento + margen + margenLinea;
        int x2 = c2 * anchoSegmento + margen + margenLinea;
        g2d.drawLine(x1, y, x2, y);
    }

    private void dibujarLinearVerticales(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(5f));
        g2d.setColor(Color.WHITE);

        int x = 2 * anchoSegmento + margen + margenLinea;
        segmentoVertical(g2d, x, 0, 14);
        x += 3 * anchoSegmento;
        segmentoVertical(g2d, x, 0, 14);

        // Draw shorter lines
        x = margen + margenLinea;
        segmentoVertical(g2d, x, 1, 13);
        x += anchoSegmento;
        segmentoVertical(g2d, x, 1, 13);
        x += 2 * anchoSegmento;
        segmentoVertical(g2d, x, 1, 14);
        x += anchoSegmento;
        segmentoVertical(g2d, x, 1, 14);

        // Draw 0 / 00 separator
		/* x = 7 * segmentWidth / 2 + margin + lineMargin;
		drawVerticalLineSegment(g2d, x, 0, 1); */
    }

    private void segmentoVertical(Graphics2D g2d, int x, int c1, int c2) {
        int y1 = c1 * anchoSegmento + margen + margenLinea;
        int y2 = c2 * anchoSegmento + margen + margenLinea;
        g2d.drawLine(x, y1, x, y2);
    }

    private void dibujarApuestas(Graphics2D g2d) {
        Font tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        g2d.setFont(tipografia);

        int x = anchoSegmento + margen + margenLinea;
        int y = 3 * anchoSegmento + margen + margenLinea;
        int anchoExtra = 4 * anchoSegmento;
        dibujarTexto(g2d, "1st 12", x, y, anchoExtra, anchoSegmento);
        x += anchoExtra;
        dibujarTexto(g2d, "2nd 12", x, y, anchoExtra, anchoSegmento);
        x += anchoExtra;
        dibujarTexto(g2d, "3rd 12", x, y, anchoExtra, anchoSegmento);

        tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 24);
        g2d.setFont(tipografia);

        x = anchoSegmento + margen + margenLinea;
        y = 4 * anchoSegmento + margen + margenLinea;
        anchoExtra = 2 * anchoSegmento;
        dibujarTexto(g2d, "1 to 18", x, y, anchoExtra, anchoSegmento);
        x += anchoExtra;
        dibujarTexto(g2d, "EVEN", x, y, anchoExtra, anchoSegmento);
        x += 3 * anchoExtra;
        dibujarTexto(g2d, "ODD", x, y, anchoExtra, anchoSegmento);
        x += anchoExtra;
        dibujarTexto(g2d, "19 to 36", x, y,anchoExtra, anchoSegmento);

        int margenDoble = 2 * margenLinea;
        x = 5 * anchoSegmento + margen + margenDoble;
        y = 4 * anchoSegmento + margen + margenDoble;
        rombo(g2d, new Color(252, 3, 3), x, y, anchoExtra - margenDoble, anchoSegmento - margenDoble);
        x += 2 * anchoSegmento;
        rombo(g2d,new Color(9, 9, 9), x, y,anchoExtra - margenDoble, anchoSegmento - margenDoble);
    }

    private void rombo(Graphics2D g2d, Color color, int x, int y, int anchoP, int altoP) {
        Polygon polygon = new Polygon();
        polygon.addPoint(x + anchoP / 2, y);
        polygon.addPoint(x + anchoP, y + altoP / 2);
        polygon.addPoint(x + anchoP / 2 , y + altoP);
        polygon.addPoint(x, y + altoP / 2);

        g2d.setColor(color);
        g2d.fillPolygon(polygon);
    }

    private BufferedImage rotarImg(BufferedImage imgR) {
        BufferedImage res = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);

        // Rotar a 90 grados
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                res.setRGB(j, alto - 1 - i, imgR.getRGB(i, j));
            }
        }

        return res;
    }
}
