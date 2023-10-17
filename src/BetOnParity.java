public class BetOnParity extends BetType{

    private boolean isEvenBet;

    public BetOnParity (boolean isEvenBet, int profit) {
        this.isEvenBet = isEvenBet;
        super.profit = profit;
    }

}