import java.util.HashSet;

public class Solution {

    /*
    常规方法，容易在大数中超时
    * */
    public int numDupDigitsAtMostN(int n) { //容易超时
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i < 10) continue; //10以下的数没有
//            System.out.println(i);
            HashSet<Integer> markSet =  new HashSet<>();
            int j = i;
            while (j!=0){
                int mark = j%10;
                if (markSet.contains(mark)) {
                    count++;
                    break;
                } else {
                    markSet.add(mark);
                    j = j/10;
                }

            }

        }
        return count;
    }

    public int numDupDigitsAtMostN1(int n) {

    }

}
