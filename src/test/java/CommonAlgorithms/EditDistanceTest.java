package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saurav on 9/2/16.
 */
public class EditDistanceTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void editDistanceOptimized() throws Exception {
        String s1 = "sunday";
        String s2 = "saturday";
        Assert.assertTrue(EditDistance.editDistanceOptimized(s1, s2) == 3);
    }

}