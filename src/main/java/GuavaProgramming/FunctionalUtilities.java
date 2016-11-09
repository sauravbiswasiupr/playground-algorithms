package GuavaProgramming;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * Created by saurav on 9/7/16.
 */
public class FunctionalUtilities {
    private final Joiner joiner;
    private final Splitter splitter;
    private Map<String, List> dataMap;
    private final Function<String, String> transformer;

    public FunctionalUtilities() {
        joiner = Joiner.on(",");
        splitter = Splitter.on("|");
        dataMap = Maps.newHashMap();
        transformer = new KeyValuesListToString();
    }

    private final class KeyValuesListToString implements Function<String, String> {
        public String apply(String key) {
            List<String> values = dataMap.get(key);
            return joiner.skipNulls().join(values);
        }
    }

    public String returnKeyValue(String key) {
        Preconditions.checkNotNull(key, "Key can't be null");
        return transformer.apply(key);
    }

    public void setDataMap(Map<String, List> map) {
        dataMap = map;
    }
}
