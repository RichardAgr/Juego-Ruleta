import java.util.Arrays;

public class RouletteGame {
    public Roulette roulette;
    public Player player;

    public RouletteGame() {
        initNewGame();
    }

    public void initNewGame() {
        player = new Player(1000);
        player.addMoney(1000);
        // Testing Bet basic logic
        player.placeBet(100, new BetOnNumber(10));
        player.placeBet(2000, new BetOnNumber(10));
        //Testing BetOnNumber
        player.placeBet(500, new BetOnNumber(10));
        //Testing BetOnColor
        player.placeBet(100, new BetOnColor("Rojo"));
        //Testing BetOnParity
        player.placeBet(100, new BetOnParity(true));
        // Testing BetOnDozen
        player.placeBet(100, new BetOnDozen(true, true, false));
        player.placeBet(100, new BetOnDozen(false, true, true));
        player.placeBet(100, new BetOnDozen(false, true, false));
        // Testing BetOnColumn
        player.placeBet(100, new BetOnColumn(0));

        player.finishBetPhase();
        System.out.println();
        System.out.println("*----- BET PHASE FINISHED -----*");
        System.out.println("The roulette is spinning...");
        Roulette.spin();
        System.out.println("And the result is...");
        System.out.println(Roulette.getResult() + " " + Roulette.getColor());
        player.checkWins();
        System.out.println();
        System.out.println("*----- GAME FINISHED -----*");

        System.out.println("*----- DEBUG LOGS: -----*");
        System.out.println(Arrays.toString(GameBoard.getRow(1)));
        System.out.println(Arrays.toString(GameBoard.getColumn(1)));
        System.out.println("*-- GAME BOARD --*");
        System.out.println(Arrays.toString(GameBoard.getCompleteColumn(0)));
        System.out.println(Arrays.toString(GameBoard.getCompleteColumn(1)));
        System.out.println(Arrays.toString(GameBoard.getCompleteColumn(2)));
    }

}
