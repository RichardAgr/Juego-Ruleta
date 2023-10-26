package logica;

/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
public class BetOnParity extends BetType {

    private final boolean isEvenBet;

    public BetOnParity(boolean isEvenBet) {
        this.isEvenBet = isEvenBet;
        super.description = "Apuesta a la paridad, ganancia de 1 a 1";
        super.profit = 35;
    }

    @Override
    public boolean checkWinCondition() {
        return isRouletteNumberEven() == isEvenBet;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }

    private boolean isRouletteNumberEven() {
        return Roulette.getResult() % 2 == 0;
    }
}