import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        int[][] dp = new int[rows][cols];
        int maxSquareSize = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park[i][j].equals("-1")) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    }
                    maxSquareSize = Math.max(maxSquareSize, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        int answer = -1;
        for (int mat : mats) {
            if (mat <= maxSquareSize) {
                answer = Math.max(answer, mat);
            }
        }

        return answer;
    }
}