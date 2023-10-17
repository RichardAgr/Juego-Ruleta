
public class BetOnColor extends BetType {

    private String colorBet;

    public BetOnColor(String colorBet, int profit) {
        this.colorBet = colorBet;
        super.profit = profit;
    }

}

