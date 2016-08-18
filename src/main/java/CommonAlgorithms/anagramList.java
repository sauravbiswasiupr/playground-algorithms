package CommonAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saurav on 8/17/16.
 */
public class anagramList {
    public anagramList() {

    }

    public static int generateHashCode(String s) {
        if (s == null)
            return -1;

        int hash = 0;
        for (char c: s.toCharArray()) {
            hash += (int)c;
        }

        return hash;
    }

    public static Map<Integer, List<String>> findAnagramsFromList(List<String> wordList) {
        Map<Integer, List<String>> hashmap = new HashMap<Integer, List<String>>();
        for (String s: wordList) {
            int hashcode = generateHashCode(s);
            if (hashmap.containsKey(hashcode)) {
                hashmap.get(hashcode).add(s);
            } else {
                List<String> tempList = new ArrayList<String>();
                tempList.add(s);
                hashmap.put(hashcode, tempList);
            }
        }

        return hashmap;
    }

    public static void main(String[] args) throws Exception {
        List<String> wordList = new ArrayList<String>();
        wordList.add("dog");
        wordList.add("god");
        wordList.add("gay");

        Map<Integer, List<String>> anagramMap = findAnagramsFromList(wordList);
        System.out.println(anagramMap);
    }
}
