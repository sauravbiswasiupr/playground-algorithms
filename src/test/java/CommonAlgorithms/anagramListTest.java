package CommonAlgorithms;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static CommonAlgorithms.anagramList.findAnagramsFromList;


/**
 * Created by saurav on 8/17/16.
 */
public class anagramListTest extends TestCase {
    public static List<String> generateWords() {
        List<String> wordList = new ArrayList<String>();
        wordList.add("dog");
        wordList.add("dgo");
        wordList.add("god");
        return wordList;
    }

    @Test
    public void testFindAnagramsFromList() {
        List<String> words = generateWords();
        Map<Integer, List<String>> map  = findAnagramsFromList(words);
        assertNotNull(map);
    }

}