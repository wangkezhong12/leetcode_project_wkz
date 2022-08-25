public class Solution {
    public int lengthOfLastWord(String s) {

        String[] res = s.split(" ");
        String x = res[res.length-1];
        return x.toCharArray().length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s));
    }
}
