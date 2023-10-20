public class BetOnDozen extends BetType implements BetValidation {
    private final boolean dozen1;
    private final boolean dozen2;
    private final boolean dozen3;

    BetOnDozen(boolean dozen1, boolean dozen2, boolean dozen3) {
        this.dozen1 = dozen1;
        this.dozen2 = dozen2;
        this.dozen3 = dozen3;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();

        if (rouletteResult > 0 && rouletteResult < 13) {
            return dozen1; // If result is in the first dozen (1-12), check if dozen1 is selected
        } else if (rouletteResult > 12 && rouletteResult < 25) {
            return dozen2; // If result is in the second dozen (13-24), check if dozen2 is selected
        } else {
            return dozen3; // If result is in the third dozen (25-36), check if dozen3 is selected
        }
    }

    @Override
    public boolean isValidBet() {
        return !dozen1 || !dozen2 || !dozen3;
    }


}
