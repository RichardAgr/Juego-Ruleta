public enum Color {
    ROJO("Rojo"),
    NEGRO("Negro"),
    VERDE("Verde");

    private final String colorName;

    private Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}