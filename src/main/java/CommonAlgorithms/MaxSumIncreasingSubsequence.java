package CommonAlgorithms;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;

/**
 * Created by saurav on 9/5/16.
 */
public class MaxSumIncreasingSubsequence {
    public static int maxSumSubSeqValue(int[] arr) {
        Preconditions.checkNotNull(arr, "Array can't be null");
        int[] msis = new int[arr.length];

        // Every element of the msis array is a member of 1 element msis (containing itself).
        for (int i = 0; i < msis.length; i++) {
            msis[i] = arr[i];
        }

        for (int i = 1; i < msis.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((arr[i] > arr[j]) && msis[i] < (msis[j] + arr[i])) {
                    msis[i] = msis[j] + arr[i];
                }
            }
        }

        return Ints.max(msis);
    }
}
