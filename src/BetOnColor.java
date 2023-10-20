
public class BetOnColor extends BetType {

    private final String colorBet;

    public BetOnColor(String colorBet) {
        this.colorBet = colorBet;
    }

    @Override
    public boolean checkWinCondition() {
        return Roulette.getColor().equals(colorBet);
    }
}

