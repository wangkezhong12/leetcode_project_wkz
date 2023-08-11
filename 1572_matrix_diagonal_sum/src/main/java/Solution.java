public class Solution {

    /**
     * 逐层遍历的方法
     **/
    public static int diagonalSum(int[][] mat) {
        int res = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || (i + j) == (mat.length-1)) {
                    res += mat[i][j];
                }
            }

        }

        return res;
    }



    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int MatSumRes = diagonalSum(mat);
        System.out.println(MatSumRes);

        int[][] mat1 = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        int MatSumRes1 = diagonalSum(mat1);
        System.out.println(MatSumRes1);

        int[][] mat2 = new int[][]{
                {5}
        };

        int MatSumRes2 = diagonalSum(mat2);
        System.out.println(MatSumRes2);



    }


}
