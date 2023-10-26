package logica;

/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
public class CornerBet extends BetType implements BetValidation{
    private int cornerA;
    private int cornerB;

    public CornerBet(int cornerA, int cornerB) {
        this.cornerA = cornerA;
        this.cornerB = cornerB;
        super.description = "Apuesta a 4 numeros, ganancia de 1 a 11";
        super.profit = 35;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        int[] winnerNumbers;
        if (cornerA > cornerB) {
            if (cornerA - 2 == cornerB) {
                winnerNumbers = new int[]{cornerA, cornerA + 1, cornerB, cornerB - 1};
            } else {
                winnerNumbers = new int[]{cornerA, cornerA - 1, cornerB, cornerB + 1};
            }
        } else {
            if (cornerA + 2 == cornerB) {
                winnerNumbers = new int[]{cornerA, cornerA - 1, cornerB, cornerB + 1};
            } else {
                winnerNumbers = new int[]{cornerA, cornerA + 1, cornerB, cornerB - 1};
            }
        }
        for ( int number : winnerNumbers) {
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

    // TODO falta validar que no salga del tablero
    @Override
    public boolean isValidBet() {
        return true;
    }

}
