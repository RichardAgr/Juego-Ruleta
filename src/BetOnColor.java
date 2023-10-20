
public class BetOnColor extends BetType {

    private String colorBet;

    public BetOnColor(String colorBet) {
        this.colorBet = colorBet;
    }

    @Override
    public boolean checkWinCondition() {
        return false;
    }
}

