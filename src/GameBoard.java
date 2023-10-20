public class GameBoard {
    private static final int[][] gameBoard = new int[][]{
            {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36}, // Row 3
            {0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35}, // Row 2
            {0, 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34}  // Row 1
    };;

    private GameBoard() {}

    public static int[] getColumn(int columnIndex) {
        // TODO VALIDATE VALID COLUMN
        int[] row = new int[gameBoard[columnIndex].length - 1]; // Length excluding 0
        int index = 0;
        for (int i = 1; i < gameBoard[columnIndex].length; i++) {
            row[index] = gameBoard[columnIndex][i];
            index++;
        }
        return row;
    }

    public static int[] getRow(int rowIndex) {
        // TODO VALIDATE VALID ROW
        int[] column = new int[gameBoard.length];
        for (int i = 0; i < gameBoard.length; i++) {
            column[i] = gameBoard[i][rowIndex];
        }
        return column;
    }

    public static int[] getCompleteColumn(int ColumnIndex) {
        return gameBoard[ColumnIndex];
    }
}
