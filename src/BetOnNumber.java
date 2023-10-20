
public class BetOnNumber extends BetType implements WinCondition {

    private int numberBet;

    public BetOnNumber(int numberBet) {
        this.numberBet = numberBet;
    }

    public boolean checkWinCondition() {
        System.out.println("WinCondition");
        return true;
    }

}

