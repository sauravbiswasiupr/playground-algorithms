package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saurav on 8/21/16.
 */
public class PangramTest {
    String s1 = "aaaabcdddddefghijklmnopqrstuvwxyzzzz";
    String s2 = "abc";

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void checkIfStringIsValidPangram() throws Exception {
        Assert.assertTrue(Pangram.isPangram(s1));
        Assert.assertFalse(Pangram.isPangram(s2));
    }

    @Test(expected = NullPointerException.class)
    public void checkIfNullStringIsPangram() {
        Assert.assertTrue(Pangram.isPangram(null));
    }

}