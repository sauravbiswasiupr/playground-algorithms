package CommonAlgorithms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by saurav on 9/1/16.
 */
public class NGramTokenizer implements Iterator {
    public int N;
    public String[] words;
    public int offset;

    public NGramTokenizer(int n, String s) {
        this.N = n;
        this.words = s.split(" ");
        this.offset = 0;
    }

    /**
     * Implement the hasNext() function where truth value is checked based on the
     * condition that offset in the array of words is not out of bounds.
     * @return
     */
    public boolean hasNext() {
        return offset < (this.words.length - N + 1);
    }

    /**
     * Create a new string from offset to offset + N -1 where N is the size of the Ngram.
     * Also remember to add spaces in case there are bigrams or more sized N grams.
     */
    public String next() {
        StringBuilder sb = new StringBuilder();
        for (int i = offset; i < offset + N; i++) {
            if (i > offset)
                sb.append(" ");
            sb.append(words[i]);

        }
        offset++;
        return sb.toString();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
