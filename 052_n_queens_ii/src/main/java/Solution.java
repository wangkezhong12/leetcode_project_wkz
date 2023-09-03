import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int totalNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuffer line = new StringBuffer();
            for (int j = 0; j < n; j++) {
                line.append('.');
            }
            board.add(line.toString());

        }

        backTrack(0, board, result);

        return result.size();
    }

    private void backTrack(int row,
                           List<String> board,
                           List<List<String>> result) {

        if (row == board.size()) {
            result.add(new ArrayList<>(board));
            return;
        }

        int n = board.get(row).length();
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            String tempStr = board.get(row);
            StringBuffer tempBuffer = new StringBuffer(tempStr);
            tempBuffer.setCharAt(col, 'Q');
            board.set(row, tempBuffer.toString());
            backTrack(row + 1, board, result);
            board.set(row, tempStr);
        }


    }

    private boolean isValid(List<String> board, int row, int col) {
        //判断当前列是否符合条件
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        //判断左上角是否符合条件
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0 ; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }

        }
        //判断右上角是否符合条件
        for (int i = row - 1, j = col + 1 ; i >= 0 && j < board.get(i).length()  ; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }
}
