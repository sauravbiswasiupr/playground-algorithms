package CommonAlgorithms;


import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import com.google.common.primitives.Chars;

import java.util.Set;

/**
 * Created by saurav on 8/21/16.
 */
public class Pangram {
    private static Splitter splitter = Splitter.on(" ").trimResults().omitEmptyStrings();
    private static Joiner joiner = Joiner.on("").skipNulls();
    private static Set<Character> goldSet = Sets.newHashSet('a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    /**
     * Check if the set of characters formed from the string s is exactly equal to the set formed from chars in
     * the gold set. If the difference of the gold set and this set is empty set, then we can say that this string
     * is a pangram. We check as precondition that the string s is not null.
     * @param s: The string to check.
     * @return: true or false
     */
    public static Boolean isPangram(String s) {
        Preconditions.checkNotNull(s, "String can't be null");
        String transformed = joiner.join(splitter.split(s));
        Set<Character> newCharSet = Sets.newHashSet(Chars.asList(transformed.toCharArray()));
        Set<Character> difference = Sets.difference(goldSet, newCharSet);
        return difference.isEmpty();
    }
}
