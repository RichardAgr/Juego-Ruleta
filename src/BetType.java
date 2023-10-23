
public abstract class BetType implements WinCondition {
    private String description = "";

    public abstract double calculateProfit(int moneyBet);

    public String getDescription() {
        return description;
    }

    public abstract boolean checkWinCondition();
}