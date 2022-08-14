import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 != 0){
            return false;
        }
        char[] chars = s.toCharArray();
        Map<Character, Character> kuoHaoMap = new HashMap<Character, Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};

        LinkedList<Character> linkedList = new LinkedList<Character>();

        for (int i = 0; i < chars.length ; i++) {
            if (!kuoHaoMap.containsKey(chars[i])){
                linkedList.addLast(chars[i]);
            } else {
                if (linkedList.size() == 0) {
                    return false;
                } else {
                    if (linkedList.getLast() == kuoHaoMap.get(chars[i])) {
                        linkedList.removeLast();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (linkedList.size() == 0) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {

    }
}
