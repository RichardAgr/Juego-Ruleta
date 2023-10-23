/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
public enum Color {
    ROJO("Rojo"),
    NEGRO("Negro"),
    VERDE("Verde");

    private final String colorName;

    private Color(String colorName) {
        this.colorName = colorName;
    }

    // Getter method to get the color name
    public String getColorName() {
        return colorName;
    }
}