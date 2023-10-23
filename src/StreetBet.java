// Apuesta transversal
public class StreetBet extends BetType implements BetValidation {
    private final int RowNumber;
    private final int profit = 11;

    public StreetBet(int streetNumber) {
        this.RowNumber = streetNumber;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        int[] row = GameBoard.getRow(RowNumber);

        for (int number : row) {
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
