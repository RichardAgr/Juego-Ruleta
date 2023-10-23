package GUI;

import java.awt.Color;
import java.awt.Point;
public class RuletaPiezas {
    private SegmetoRueda[] segRueda;
    private Color rojo;
    private Color verde;

    public RuletaPiezas(){
        this.rojo = new Color(205, 29, 33);
        this.verde = new Color(56, 173, 2);
        segRueda = crearSegRueda();
    }

    private SegmetoRueda[] crearSegRueda(){
        SegmetoRueda[] ruedaSegmento = new SegmetoRueda[38];
        ruedaSegmento[0] = new SegmetoRueda("00", verde, new Point(12, 10));
        ruedaSegmento[1] = new SegmetoRueda("27", rojo, new Point(12, 10));
        ruedaSegmento[2] = new SegmetoRueda("10", Color.BLACK, new Point(12, 10));
        ruedaSegmento[3] = new SegmetoRueda("25", rojo, new Point(12, 10));
        ruedaSegmento[4] = new SegmetoRueda("29", Color.BLACK, new Point(12, 10));
        ruedaSegmento[5] = new SegmetoRueda("12", rojo, new Point(11, 11));
        ruedaSegmento[6] = new SegmetoRueda("8", Color.BLACK, new Point(7, 10));
        ruedaSegmento[7] = new SegmetoRueda("19", rojo, new Point(10, 10));
        ruedaSegmento[8] = new SegmetoRueda("31", Color.BLACK, new Point(12, 10));
        ruedaSegmento[9] = new SegmetoRueda("18", rojo, new Point(10, 12));
        ruedaSegmento[10] = new SegmetoRueda("6", Color.BLACK, new Point(6, 12));
        ruedaSegmento[11] = new SegmetoRueda("21", rojo, new Point(12, 10));
        ruedaSegmento[12] = new SegmetoRueda("33", Color.BLACK, new Point(12, 10));
        ruedaSegmento[13] = new SegmetoRueda("16", rojo, new Point(12, 10));
        ruedaSegmento[14] = new SegmetoRueda("4", Color.BLACK, new Point(6, 10));
        ruedaSegmento[15] = new SegmetoRueda("23", rojo, new Point(10, 10));
        ruedaSegmento[16] = new SegmetoRueda("35", Color.BLACK, new Point(10, 10));
        ruedaSegmento[17] = new SegmetoRueda("14", rojo, new Point(10, 10));
        ruedaSegmento[18] = new SegmetoRueda("2", Color.BLACK, new Point(4, 10));
        ruedaSegmento[19] = new SegmetoRueda("0", verde, new Point(4, 10));
        ruedaSegmento[20] = new SegmetoRueda("28", Color.BLACK, new Point(10, 10));
        ruedaSegmento[21] = new SegmetoRueda("9", rojo, new Point(4, 8));
        ruedaSegmento[22] = new SegmetoRueda("26", Color.BLACK, new Point(10, 8));
        ruedaSegmento[23] = new SegmetoRueda("30", rojo, new Point(9, 9));
        ruedaSegmento[24] = new SegmetoRueda("11", Color.BLACK, new Point(10, 8));
        ruedaSegmento[25] = new SegmetoRueda("7", rojo, new Point(6, 10));
        ruedaSegmento[26] = new SegmetoRueda("20", Color.BLACK, new Point(10, 8));
        ruedaSegmento[27] = new SegmetoRueda("32", rojo, new Point(10, 8));
        ruedaSegmento[28] = new SegmetoRueda("17", Color.BLACK, new Point(12, 10));
        ruedaSegmento[29] = new SegmetoRueda("5", rojo, new Point(6, 10));
        ruedaSegmento[30] = new SegmetoRueda("22", Color.BLACK, new Point(12, 10));
        ruedaSegmento[31] = new SegmetoRueda("34", rojo, new Point(12, 10));
        ruedaSegmento[32] = new SegmetoRueda("15", Color.BLACK, new Point(12, 10));
        ruedaSegmento[33] = new SegmetoRueda("3", rojo, new Point(6, 10));
        ruedaSegmento[34] = new SegmetoRueda("24", Color.BLACK, new Point(12, 10));
        ruedaSegmento[35] = new SegmetoRueda("36", rojo, new Point(12, 10));
        ruedaSegmento[36] = new SegmetoRueda("13", Color.BLACK, new Point(12, 10));
        ruedaSegmento[37] = new SegmetoRueda("1", rojo, new Point(8, 10));
        return  ruedaSegmento;
    }

    public int length(){
        return segRueda.length;
    }

    public SegmetoRueda getSementoRueda(int i){
        return segRueda[i];
    }

    public SegmetoRueda[] getSegmentosRuedas(){
        return segRueda;
    }

    public String[] getRandoNumero(int ini, int fin){
        String[] res = new String[fin - ini + 1];
        int indice = 0;
        for (int i = ini; i <= fin; i++) {
            res[indice++] = Integer.toString(i);
        }
        return res;
    }

    public String[] getNumeroImpares() {
        String[] res = new String[18];
        int indice = 0;
        for (int i = 1; i < 36; i += 2) {
            res[indice++] = Integer.toString(i);
        }
        return res;
    }

    public String[] getNumeroPares() {
        String[] res = new String[18];
        int indice = 0;
        for (int i = 2; i <= 36; i += 2) {
            res[indice++] = Integer.toString(i);
        }
        return res;
    }

    public String[] getNumerosRojos() {
        String[] res = new String[18];
        int indice = 0;
        for (SegmetoRueda ruedaSeg : segRueda) {
            if (ruedaSeg.getColorBack().equals(rojo)) {
                res[indice++] = ruedaSeg.getNumeroRueda();
            }
        }
        return res;
    }

    public String[] getNumerosNegros() {
        String[] res = new String[18];
        int indice = 0;
        for (SegmetoRueda ruedaSeg : segRueda) {
            if (ruedaSeg.getColorBack().equals(Color.BLACK)) {
                res[indice++] = ruedaSeg.getNumeroRueda();
            }
        }
        return res;
    }

    public Color getRojo() {
        return rojo;
    }

    public Color getVerde() {
        return verde;
    }

    public Color getColorBack(int num) {
        String numString = Integer.toString(num);
        for (SegmetoRueda ruedaSeg : segRueda) {
            if (numString.equals(ruedaSeg.getNumeroRueda())) {
                return ruedaSeg.getColorBack();
            }
        }
        return verde;
    }
}
