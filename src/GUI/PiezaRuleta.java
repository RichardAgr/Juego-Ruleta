/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
package GUI;

public class PiezaRuleta {
    public final int anchoSegmento,margen,margenLinea,margenImg;

    public  PiezaRuleta() {
		margenImg = 10;
		margen = 15;
		margenLinea = 3;
		anchoSegmento = 54;
	}

	public int getAnchoSegmento() {
		return anchoSegmento;
	}

	public int getMargen() {
		return margen;
	}

	public int getMargenLinea() {
		return margenLinea;
	}

	public int getMargenImg() {
		return margenImg;
	}
}
