public class BetOnParity extends BetType{

    private boolean isEvenBet;

    public BetOnParity (boolean isEvenBet) {
        this.isEvenBet = isEvenBet;
    }

    @Override
    public boolean checkWinCondition() {
        return false;
    }
}