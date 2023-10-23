/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
public class BetOnColumn extends BetType implements BetValidation {
    private final int columnNumber;

    public BetOnColumn(int columnNumber) {
        this.columnNumber = columnNumber;
        super.description = "Apuesta a un número, ganancia de 2 a 1";
        super.profit = 2;
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
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }

    @Override
    public boolean isValidBet() {
        return true;
    }
}