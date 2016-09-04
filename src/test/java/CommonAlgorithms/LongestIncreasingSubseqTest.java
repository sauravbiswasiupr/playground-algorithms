package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saurav on 9/3/16.
 */
public class LongestIncreasingSubseqTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void lisTest() throws Exception {
        int[] array = {10, 22, 9, 33, 21, 50, 41, 60};
        int lis_value = LongestIncreasingSubseq.lis(array, array.length);
        Assert.assertTrue(lis_value == 5);
    }

}