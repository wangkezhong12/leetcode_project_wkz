import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> resMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String hashKey = new String(chars);
//            System.out.println(strs[i] + " : " + String.valueOf(hashKey));

            if (resMap.containsKey(hashKey)) {
                resMap.get(hashKey).add(strs[i]);
            } else {
                resMap.put(hashKey, new ArrayList<>(Arrays.asList(new String[]{strs[i]})));
            }

        }

        return new ArrayList<>(resMap.values());


    }


}
