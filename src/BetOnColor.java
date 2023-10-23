
public class BetOnColor extends BetType {

    private final Color colorBet;

    public BetOnColor(Color colorBet) {
        this.colorBet = colorBet;
        super.description = "Apuesta a un color, ganancia de 1 a 1";
        super.profit = 1;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getColor() == colorBet;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }

}

