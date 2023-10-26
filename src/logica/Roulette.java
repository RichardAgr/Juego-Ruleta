package logica;/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

import java.util.Random;

public class Roulette {
    private static final Random randomNumber;
    private static int result;

    static {
        randomNumber = new Random();
    }

    private Roulette() {
    }

    public static void spin() {
        System.out.println();
        System.out.println("The roulette is spinning...");
        result = randomNumber.nextInt(37);
    }

    public static int getResult() {
        return result;
    }

    public static void setResult(int result) {
        Roulette.result = result;
    }

    public static Color getColor() {
        if (result == 0) {
            return Color.VERDE;
        } else if ((result > 0 && result < 11) || (result > 18 && result < 29)) {
            return (result % 2 == 0) ? Color.NEGRO : Color.ROJO;
        } else if ((result > 10 && result < 19) || (result > 28 && result < 37)) {
            return (result % 2 == 0) ? Color.ROJO : Color.NEGRO;
        } else {
            return Color.VERDE;
        }
    }
}