
public abstract class BetType implements WinCondition {

    public int profit = 1;
    private String description = "";

    public int getProfit() {
        return profit;
    }

    public String getDescription() {
        return description;
    }

    public abstract boolean checkWinCondition();
}