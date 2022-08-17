import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 *  
 *
 * 注意：
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 空白格用 '.' 表示。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-sudoku
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean flagRow = true;
        boolean flagCol = true;
        boolean flagMatrix = true;

        Set<Character> matrixSet = new HashSet<Character>();

        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<Character>();
            int rowNum = 0;
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                //判断每行结果
                rowSet.add(board[i][j]);
                if (rowNum == rowSet.size()) { //如果加入非'.'字符后长度未发生变化，则说明有重复项
                    flagRow =  false;
                }
                rowNum ++;

            }

        }

        for (int j = 0; j < 9; j++) {
            Set<Character> colSet = new HashSet<Character>();
            int colNum = 0;
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') continue;
                colSet.add(board[i][j]);
                if (colNum == colSet.size()) {
                    flagCol = false;
                }
                colNum ++;
            }
        }



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    //board[3*i+k][3*j+k]
                    System.out.println(3*i+k);
                    System.out.println(3*j+k);
                }
                System.out.println("----------------");
            }
        }





        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = new char[][] {
                {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        solution.isValidSudoku(board);

    }
}
