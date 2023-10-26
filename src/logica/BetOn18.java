/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */
package logica;
public class BetOn18 extends BetType {

    private final boolean isFirst18;

    public BetOn18(boolean isFirst18) {
        this.isFirst18 = isFirst18;
        super.description = "Apuesta a la pasa y falta, ganancia de 1 a 18";
        super.profit = 1;
    }

    @Override
    public boolean checkWinCondition() {
        if (isFirst18) {
            return Roulette.getResult() <= 18;
        } else {
            return Roulette.getResult() > 18;
        }
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }
}
