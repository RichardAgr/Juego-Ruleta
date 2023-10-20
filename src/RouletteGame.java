public class RouletteGame {
    public Roulette roulette;
    public Player player;

    public RouletteGame(){
        initNewGame();
    }

    public void initNewGame() {
        player = new Player(1000);
        player.addMoney(500);
        player.placeBet(100, new BetOnNumber(10));
        player.placeBet(2000, new BetOnNumber(10));
        player.placeBet(500, new BetOnNumber(10));
        player.finishBetPhase();
        System.out.println();
        System.out.println("*----- BET PHASE FINISHED -----*");
        System.out.println("The roulette is spinning...");
        Roulette.spin();
        System.out.println("And the result is...");
        System.out.println(Roulette.getResult() + " " + Roulette.getColor());
        player.checkWins();
    }

}
