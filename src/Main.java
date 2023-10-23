// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
public class Main {

    static RouletteGame rouletteGame;

    public static void main(String[] args) {
        initGame();
    }

    static void initGame() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to the Casino!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enjoy the games and try your luck!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        rouletteGame = new RouletteGame();
    }

}