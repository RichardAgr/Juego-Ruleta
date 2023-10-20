
public class BetOnNumber extends BetType {
    private int numberBet;

    public BetOnNumber(int numberBet) {
        this.numberBet = numberBet;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getResult() == numberBet;
    }

    public int getNumberBet() {
        return numberBet;
    }


}

