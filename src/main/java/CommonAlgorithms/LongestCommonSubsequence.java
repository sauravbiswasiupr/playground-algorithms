package CommonAlgorithms;

import com.google.common.base.Preconditions;
import static java.lang.Math.max;

/**
 * Created by saurav on 9/3/16.
 */
public class LongestCommonSubsequence {
    public static String lcs(String s1, String s2) {
        Preconditions.checkNotNull(s1, "String s1 can't be null");
        Preconditions.checkNotNull(s2, "String s2 can't be null");

        int m = s1.length(); int n = s2.length();
        int[][] LCS = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if ((i == 0) || (j == 0))
                    LCS[i][j] = 0;

                else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    LCS[i][j] = 1 + LCS[i-1][j-1];
                } else {
                    LCS[i][j] = max(LCS[i-1][j], LCS[i][j-1]);
                }
            }
        }

        // Construct the LCS string.
        StringBuilder sb = new StringBuilder();
        int left = m;
        int right = n;

        while ((left > 0) && (right > 0)) {
            if (s1.charAt(left-1) == s2.charAt(right-1)) {
                sb.append(s1.charAt(left-1));
                left -= 1;
                right -= 1;
            } else if (LCS[left-1][right] > LCS[left][right-1]) {
                left -= 1;
            } else {
                right -= 1;
            }
        }

        return sb.reverse().toString();
    }
}
