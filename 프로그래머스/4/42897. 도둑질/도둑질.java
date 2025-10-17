import java.util.*;
import java.io.*;

// input int[] length >= 3 , length <= 1000000
// output int

class Solution {
    
    int[][] dp = new int[2][1000001];
    
    public int solution(int[] money) {
        int answer = 0;
        
        dp[0][0] = 0;
        dp[1][0] = 0;
        dp[0][1] = 0;
        dp[1][1] = money[1];
        
        for(int i = 2; i < money.length; i++){
            dp[0][i] = Math.max(dp[0][i - 1], dp[0][i - 2] + money[i]);
            dp[1][i] = Math.max(dp[1][i - 1], dp[1][i - 2] + money[i]);
        }
        
        
        return Math.max(money[0] + dp[0][money.length - 2], dp[1][money.length - 1]);
    }
}