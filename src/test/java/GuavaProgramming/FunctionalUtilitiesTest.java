package GuavaProgramming;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by saurav on 9/7/16.
 */
public class FunctionalUtilitiesTest {
    FunctionalUtilities funcUtils;
    @Before
    public void setUp() throws Exception {
        funcUtils = new FunctionalUtilities();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void returnKeyValueTest() throws Exception {
        Map<String, List> dataMap = Maps.newHashMap();
        dataMap.put("messi", Lists.newArrayList("barcelona", "argentina", "newell's"));
        dataMap.put("ronaldo", Lists.newArrayList("real madrid", "portugal", "sporting"));
        funcUtils.setDataMap(dataMap);

        final String expectedMessi = "barcelona,argentina,newell's";
        final String expectedRonaldo = "real madrid,portugal,sporting";

        Assert.assertEquals(expectedMessi, funcUtils.returnKeyValue("messi"));
        Assert.assertEquals(expectedRonaldo, funcUtils.returnKeyValue("ronaldo"));
        Assert.assertNotEquals("real madrid, portugal, sporting", funcUtils.returnKeyValue("ronaldo"));
    }

}