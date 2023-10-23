public class SplitBet extends BetType implements BetValidation{
    private final int numberA;
    private final int numberB;

    public SplitBet(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        super.description = "Apuesta de caballo, ganancia de 1 a 17";
        super.profit = 17;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        return rouletteResult == numberA || rouletteResult == numberB;
    }

    @Override
    public double calculateProfit(int moneyBet) {
        return ProfitCalculator.calculateProfit(moneyBet, super.profit);
    }

    @Override
    public boolean isValidBet() {
//        if (numberA + 1 == numberB) {
//
//        }
//        if (numberA - 1 == numberB) {
//
//        }
//        if (numberA + 3 == numberB) {
//
//        }
//        if (numberA - 3 == numberB) {
//
//        }
        return true;
    }
}
