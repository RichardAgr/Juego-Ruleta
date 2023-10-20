public class BetOnParity extends BetType{

    private final boolean isEvenBet;

    public BetOnParity (boolean isEvenBet) {
        this.isEvenBet = isEvenBet;
    }

    @Override
    public boolean checkWinCondition() {
        return isRouletteNumberEven() == isEvenBet;
    }

    private boolean isRouletteNumberEven() {
        return Roulette.getResult() % 2 == 0;
    }
}