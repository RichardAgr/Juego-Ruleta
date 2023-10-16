
public class BetOnNumber extends BetType {

    private int colorBet;

    public BetOnNumber(int colorBet, int profit) {
        this.colorBet = colorBet;
        super.profit = profit;
    }

}

