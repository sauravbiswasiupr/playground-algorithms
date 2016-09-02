package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by saurav on 9/1/16.
 */
public class NGramTokenizerTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNgramTokenization() {
        String s = "you have been terminated";
        Set<String> unigramGoldSet = new LinkedHashSet<String>(Arrays.asList("you", "have", "been", "terminated"));
        Set<String> bigramGoldSet = new LinkedHashSet<String>(Arrays.asList("you have", "have been", "been terminated"));

        NGramTokenizer unigramTokenizer = new NGramTokenizer(1, s);
        NGramTokenizer bigramTokenizer = new NGramTokenizer(2, s);

        Set<String> tokenizedUnigrams = new LinkedHashSet<String>();
        Set<String> tokenizedBigrams = new LinkedHashSet<String>();

        while (unigramTokenizer.hasNext()) {
            tokenizedUnigrams.add(unigramTokenizer.next());
        }

        while (bigramTokenizer.hasNext()) {
            tokenizedBigrams.add(bigramTokenizer.next());
        }

        Assert.assertTrue(unigramGoldSet.equals(tokenizedUnigrams));
        Assert.assertTrue(bigramGoldSet.equals(tokenizedBigrams));
    }

}