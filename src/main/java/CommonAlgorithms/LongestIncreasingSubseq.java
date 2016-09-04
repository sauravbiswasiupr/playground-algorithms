package CommonAlgorithms;

import com.google.common.primitives.Ints;

/**
 * Created by saurav on 9/3/16.
 */
public class LongestIncreasingSubseq {
    public static int lis(int[] arr, int n) {
        int[] lis_array = new int[n];
        
        for (int i = 0; i < n; i++) {
            lis_array[i] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((arr[i] > arr[j]) && (lis_array[i] < lis_array[j] + 1)) {
                    lis_array[i] = lis_array[j] + 1;
                }
            }
        }

        return Ints.max(lis_array);
    }
}
