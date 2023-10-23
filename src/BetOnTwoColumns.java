public class BetOnTwoColumns extends BetType implements BetValidation {

    private final int columnNumber1;
    private final int columnNumber2;

    BetOnTwoColumns(int columnNumber1, int columnNumber2) {
        this.columnNumber1 = columnNumber1;
        this.columnNumber2 = columnNumber2;
        super.description = "Apuesta a 2 columnas, ganancia de 0.5 a 1";
        super.profit = 0.5f;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        int[] column1 = GameBoard.getColumn(columnNumber1);
        int[] column2 = GameBoard.getColumn(columnNumber2);

        for (int number : column1) {
            if (number == rouletteResult) {
                return true;
            }
        }

        for (int number : column2) {
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
