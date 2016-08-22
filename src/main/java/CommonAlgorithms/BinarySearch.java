package CommonAlgorithms;

import com.google.common.base.Preconditions;

/**
 * Created by saurav on 8/20/16.
 */
public class BinarySearch {
    /**
     * Iterative binary search algorithm to search for the presence of a particular key
     * in an array. Array must be sorted for the binary search algorithm to work.
     * @param array: An array of integers.
     * @param key: The value to search for in the array.
     * @return: The index of the value or else -1
     */
    public static int searchIterative(int[] array, int key) {
        Preconditions.checkNotNull(key, "Key to search can't be null");
        Preconditions.checkNotNull(array, "Array can't be null");

        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
