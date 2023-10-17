public class RouletteGame {
    public Roulette roulette;
    public Player player;

    public RouletteGame(){
        initNewGame();
    }

    public void initNewGame() {
        roulette = new Roulette();
        player = new Player(1000);
        player.addMoney(500);
        player.placeBet(100, new BetOnNumber(10));
        player.placeBet(2000, new BetOnNumber(10));
        player.placeBet(500, new BetOnNumber(10));
        player.finishBetPhase();
        roulette.spin();
        System.out.println(roulette.getResult());
    }

}
