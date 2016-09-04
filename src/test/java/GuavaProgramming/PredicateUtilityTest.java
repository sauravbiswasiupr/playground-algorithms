package GuavaProgramming;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by saurav on 9/7/16.
 */
public class PredicateUtilityTest {
    PredicateUtility predicateUtility;
    @Before
    public void setUp() throws Exception {
        predicateUtility = new PredicateUtility();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPredicateUtility() {
        final List<String> strings = Lists.newArrayList("saurav", "sougata", "deep", "debopriyo");
        final Iterable<String> filtered = Iterables.filter(strings, predicateUtility);
        Assert.assertEquals(Lists.newArrayList("saurav", "sougata", "debopriyo"), Lists.newArrayList(filtered));
    }
}