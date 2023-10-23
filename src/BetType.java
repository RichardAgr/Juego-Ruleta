
public abstract class BetType {
    protected String description = "No existe descripción";
    protected float profit;


    public abstract double calculateProfit(int moneyBet);

    public abstract boolean checkWinCondition();

    public String getDescription() {
        return description;
    }

    public float getProfit() {
        return profit;
    }


}