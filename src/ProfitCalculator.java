public class ProfitCalculator {

    private ProfitCalculator () {}

    public static double calculateProfit(int moneyBet, float betProfit) {
        return moneyBet * betProfit + moneyBet;
    }

}
