import java.util.Arrays;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int[] dp = new int[121];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int[] item : info) {
            int a_cost = item[0];
            int b_cost = item[1];
            for (int j = 120; j >= 0; j--) {
                if (dp[j] == Integer.MAX_VALUE) {
                    continue;
                }
                
                if (j + a_cost <= 120) {
                    dp[j + a_cost] = Math.min(dp[j + a_cost], dp[j]);
                }
                
                dp[j] = dp[j] + b_cost;
            }
        }
        
        for (int j = 0; j < n; j++) {
            if (dp[j] < m) {
                return j;
            }
        }
        
        return -1;
    }
}