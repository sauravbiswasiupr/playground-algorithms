package CommonAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by saurav on 8/20/16.
 */
public class BinarySearchTest {
    BinarySearch binSearch;
    int[] array = {1, 2, 3, 4, 5, 7, 8, 10};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void searchIterativeFound() throws Exception {
        int index = binSearch.searchIterative(this.array, 2);
        Assert.assertTrue(index == 1);
    }

    @Test
    public void searchIterativeKeyNotFound() throws Exception {
        int index = binSearch.searchIterative(this.array, 20);
        Assert.assertTrue(index == -1);
    }
}