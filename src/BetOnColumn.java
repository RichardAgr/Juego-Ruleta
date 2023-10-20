public class BetOnColumn extends BetType implements BetValidation {
    private final int columnNumber;

    public BetOnColumn(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    @Override
    public boolean checkWinCondition() {
        int rouletteResult = Roulette.getResult();
        int[] column = GameBoard.getColumn(columnNumber);

        for (int number : column) {
            if (number == rouletteResult) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isValidBet() {
        return false;
    }
}

// TODO for 2 columns approach

//    public boolean checkWinCondition() {
//        int rouletteResult = Roulette.getResult();
//        int[] column1 = GameBoard.getColumn(columnNumber1);
//        int[] column2 = GameBoard.getColumn(columnNumber2);
//
//        for (int number : column1) {
//            if (number == rouletteResult) {
//                return true;
//            }
//        }
//
//        for (int number : column2) {
//            if (number == rouletteResult) {
//                return true;
//            }
//        }
//
//        return false;
//    }