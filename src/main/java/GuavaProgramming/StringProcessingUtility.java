package GuavaProgramming;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;

import java.util.List;
import java.util.Map;

/**
 * Created by saurav on 9/7/16.
 */
public class StringProcessingUtility {
    private final Joiner stringListJoiner;
    private final Joiner mapJoiner;
    private final Splitter splitter;

    public StringProcessingUtility() {
        stringListJoiner = Joiner.on(",");
        mapJoiner = Joiner.on("#");
        splitter = Splitter.on("|");
    }
    public String joinStringList(List<String> strings) {
        return stringListJoiner.skipNulls().join(strings);
    }

    public String joinMapAsString(Map<String, String> someMap) {
        Preconditions.checkNotNull(someMap, "Map can't be null");
        return mapJoiner.withKeyValueSeparator("=").join(someMap);
    }

    public Iterable<String> stringSplitter(String stringToSplit) {
        Preconditions.checkNotNull(stringToSplit, "String can't be null");
        return splitter.omitEmptyStrings().trimResults().split(stringToSplit);
    }
}
