
public class BetOnColor extends BetType {

    private final String colorBet;
    private final int profit = 1;

    public BetOnColor(String colorBet) {
        this.colorBet = colorBet;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getColor().equals(colorBet);
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, profit);
    }

    public int getProfit() {
        return profit;
    }
}

