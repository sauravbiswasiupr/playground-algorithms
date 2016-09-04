package GuavaProgramming;


import com.google.common.base.Predicate;

/**
 * Created by saurav on 9/7/16.
 */
public class PredicateUtility implements Predicate<String> {
    public boolean apply(String input) {
        if (input.length() < 5)
            return false;
        else
            return true;
    }
}

