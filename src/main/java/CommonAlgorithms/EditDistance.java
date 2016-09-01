package CommonAlgorithms;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;

/**
 * Created by saurav on 9/2/16.
 */
public class EditDistance {
    public static int editDistanceOptimized(String s1, String s2) {
        Preconditions.checkArgument((s1 != null) && (s2 != null), "Both strings must be non null");
        int m = s1.length();
        int n = s2.length();

        int[][] editsTable = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    editsTable[i][j] = j;
                }

                else if (j == 0) {
                    editsTable[i][j] = i;
                }

                else if (s1.charAt(i-1) == s2.charAt(j-1))
                    editsTable[i][j] = editsTable[i-1][j-1];

                else {
                    int[] valsToCompare = {editsTable[i-1][j], editsTable[i-1][j-1], editsTable[i][j-1]};
                    int minimum = 1 + Ints.min(valsToCompare);
                    editsTable[i][j] = minimum;
                }
            }
        }

        return editsTable[m][n];
    }
}
