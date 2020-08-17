package backtracking;

public class cal8queens {
    int[] result = new int[8];

    public void cal8queens(int row) {
        if (row == 8) {
            printQueens(result);
            return;
        }
        for (int column = 0; column < 8; column++) {
            if (isOk(row, column)) {
                result[row] = column;
                cal8queens(row + 1);
            }
        }
    }

    private boolean isOk(int row, int column) {
        int leftup = column - 1, rightup = column + 1;
        for (int i = row - 1; i >= 0; i--) {
            if (result[i] == column) return false; //第i行的column列有棋子吗？
            if (leftup >= 0) {
                if (result[i] == leftup) return false; //考察左上对角线
            }
            if (rightup < 8) {
                if (result[i] == rightup) return false;//考察右上对角线
            }
            leftup--;
            rightup++;
        }
        return true;
    }

    private void printQueens(int[] result) {
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (result[row] == column) System.out.print("Q");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
