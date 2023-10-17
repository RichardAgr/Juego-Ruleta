public class RouletteGame {
    public Roulette roulette;
    public Player player;

    public RouletteGame(){
        initNewGame();
    }

    public void initNewGame() {
        roulette = new Roulette();
        player = new Player();
        player.finishBetPhase();
        roulette.spin();
        System.out.println(roulette.getResult());
    }
}
