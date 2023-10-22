package GUI;

import java.awt.Color;
import java.awt.Point;
public class SegmetoRueda {
    private Color colorBack;

    private Point correlacionDelta;

    private String numeroRueda;

    public SegmetoRueda(String numeroRueda, Color colorBack, Point correlacionDelta) {
        this.numeroRueda = numeroRueda;
        this.colorBack = colorBack;
        this.correlacionDelta = correlacionDelta;
    }

    public Color getColorBack() {
        return colorBack;
    }

    public Point getCorrelacionDelta() {
        return correlacionDelta;
    }

    public String getNumeroRueda() {
        return numeroRueda;
    }
}
