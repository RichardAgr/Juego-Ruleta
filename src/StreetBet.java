// Apuesta transversal
public class StreetBet extends BetType implements BetValidation {
    private final int rowNumber;

    public StreetBet(int streetNumber) {
        this.rowNumber = streetNumber;
        super.description = "Apuesta transversal, ganancia de 11 a 1";
        super.profit = 11;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        int[] row = GameBoard.getRow(rowNumber);

        for (int number : row) {
            if (number == rouletteResult) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }

    @Override
    public boolean isValidBet() {
        return true;
    }

}
