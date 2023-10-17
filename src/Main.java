// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static RouletteGame rouletteGame;

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        initGame();

    }

    static void initGame() {
        rouletteGame = new RouletteGame();
    }

    static void initBets() {
        //BetType bet1 = new BetType("1", 1);
        //BetType bet2 = new BetType("color", 2);
        //BetType bet3 = new BetType(true, 3);
        BetType bet5 = new BetOnNumber(20);
        BetType bet4 = new BetOnColor("red");
        BetType bet6 = new BetOnParity(true);

        System.out.println("Bet 5 info:");
        System.out.println(bet5.getDescription());
        System.out.println(bet5.getProfit());
    }

}