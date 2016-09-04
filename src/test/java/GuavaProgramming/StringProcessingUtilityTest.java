package GuavaProgramming;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by saurav on 9/7/16.
 */
public class StringProcessingUtilityTest {
    final StringProcessingUtility sp = new StringProcessingUtility();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void joinStringListTest() throws Exception {
        final List<String> strings = Lists.newArrayList("I", "am", "good");
        Assert.assertTrue(sp.joinStringList(strings).equals("I,am,good"));
    }

    @Test
    public void joinMapAsStringTest() {
        final Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("messi", "barcelona");
        testMap.put("ronaldo", "real");
        testMap.put("griezmann", "atletico");

        Assert.assertEquals(sp.joinMapAsString(testMap), "messi=barcelona#ronaldo=real#griezmann=atletico");
    }

    @Test
    public void splitStringAsListTest() throws NullPointerException {
        final String toSplit="foo|bar|baz ";
        Iterable<String> expectedList = Lists.newArrayList("foo","bar","baz");
        Assert.assertEquals(expectedList, Lists.newArrayList(sp.stringSplitter(toSplit)));
    }
}