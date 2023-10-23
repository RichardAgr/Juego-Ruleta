
public class BetOnNumber extends BetType {
    private final int numberBet;
    private final int profit = 35;

    public BetOnNumber(int numberBet) {
        this.numberBet = numberBet;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getResult() == numberBet;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, profit);
    }

    public int getProfit() {
        return profit;
    }

}

