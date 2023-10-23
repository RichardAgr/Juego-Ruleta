
public class BetOnColor extends BetType {

    private final Color colorBet;
    private final int profit = 1;

    public BetOnColor(Color colorBet) {
        this.colorBet = colorBet;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getColor() == colorBet;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, profit);
    }

    public int getProfit() {
        return profit;
    }
}

