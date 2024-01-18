import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int countWords(String[] words1, String[] words2) {

        int wordCount = 0;
        HashMap<String, Integer> w1map = count(words1);

        for (int i = 0; i < words2.length; i++) {
            if (!w1map.containsKey(words2[i])) {
                continue;
            } else {
                w1map.replace(words2[i], w1map.get(words2[i])-1);
            }

        }

        for (Map.Entry<String, Integer> entry:
                w1map.entrySet()) {

            if (entry.getValue() == 0) {
                wordCount++;
            }
        }
        return wordCount;

    }

    public int countWords1(String[] words1, String[] words2) {
        int wordCount = 0;
        HashMap<String, Integer> w1map = count(words1);
        HashMap<String, Integer> w2map = count(words2);

        System.out.println(w1map.toString());
        System.out.println(w2map.toString());
        for (Map.Entry<String, Integer> entry:
                w1map.entrySet()) {
            if (w2map.containsKey(entry.getKey())
                    && entry.getValue() == 1
                    && w2map.get(entry.getKey()) == 1) {
                wordCount++;
            }
        }
        return wordCount;

    }

    public HashMap<String, Integer> count(String[] words) {

        HashMap<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (countMap.containsKey(words[i])) {
                countMap.replace(words[i], countMap.get(words[i])+1);
            } else {
                countMap.put(words[i], 1);
            }
        }


        return countMap;
    }
}
