public class BetOnColumn extends BetType implements BetValidation {
    private final int columnNumber;
    private final int profit = 2;

    public BetOnColumn(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        int[] column = GameBoard.getColumn(columnNumber);

        for (int number : column) {
            if (number == rouletteResult) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, profit);
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public boolean isValidBet() {
        return true;
    }
}