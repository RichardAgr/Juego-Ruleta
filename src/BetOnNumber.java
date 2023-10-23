/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
public class BetOnNumber extends BetType {
    private final int numberBet;

    public BetOnNumber(int numberBet) {
        this.numberBet = numberBet;
        super.description = "Apuesta a un número, ganancia de 35 a 1";
        super.profit = 35;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getResult() == numberBet;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }

}

