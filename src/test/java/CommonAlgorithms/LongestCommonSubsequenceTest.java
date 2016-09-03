package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saurav on 9/3/16.
 */
public class LongestCommonSubsequenceTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void lcsTest() throws Exception {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        String lcs = LongestCommonSubsequence.lcs(s1, s2);
        Assert.assertTrue(lcs.equals("GTAB"));
    }

}