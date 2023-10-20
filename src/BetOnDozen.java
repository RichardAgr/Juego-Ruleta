public class BetOnDozen extends BetType implements BetValidation{
    private boolean dozen1;
    private boolean dozen2;
    private boolean dozen3;

    BetOnDozen(boolean dozen1, boolean dozen2, boolean dozen3) {
        this.dozen1 = dozen1;
        this.dozen2 = dozen2;
        this.dozen3 = dozen3;
    }

    @Override
    public boolean checkWinCondition() {
        return false;
    }

    @Override
    public boolean isValidBet() {
        return false;
    }


}
