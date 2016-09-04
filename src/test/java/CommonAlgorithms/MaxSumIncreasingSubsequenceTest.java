package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by saurav on 9/5/16.
 */
public class MaxSumIncreasingSubsequenceTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void maxSumSubSeqLength() throws Exception {
        final int[] arr = {1, 101, 2, 3, 100, 4, 5};
        int maxSumSubSeqValue= MaxSumIncreasingSubsequence.maxSumSubSeqValue(arr);
        Assert.assertTrue(maxSumSubSeqValue == 106);
    }

}