public class Solution {
    public int encryptionCalculate(int dataA, int dataB) {


        while(dataB != 0) {
            int sum = dataA^dataB;
            int carry = (dataA & dataB) << 1;
            dataA = sum;
            dataB = carry;
        }

        return dataA;

    }
}
