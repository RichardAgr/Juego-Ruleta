public class BetOnParity extends BetType {

    private final boolean isEvenBet;
    private final int profit = 1;

    public BetOnParity(boolean isEvenBet) {
        this.isEvenBet = isEvenBet;
    }

    @Override
    public boolean checkWinCondition() {
        return isRouletteNumberEven() == isEvenBet;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, profit);
    }

    public int getProfit() {
        return profit;
    }

    private boolean isRouletteNumberEven() {
        return Roulette.getResult() % 2 == 0;
    }
}