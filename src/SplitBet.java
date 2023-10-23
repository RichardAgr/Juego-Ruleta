public class SplitBet extends BetType implements BetValidation{
    private final int numberA;
    private final int numberB;
    private final int profit = 17;

    public SplitBet(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        return rouletteResult == numberA || rouletteResult == numberB;
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
