import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int max = Integer.MIN_VALUE;
        int rootNum = triangle[0][0];
        if(triangle.length < 2) {
            return rootNum;
        }
        int[][] memo = new int[501][501];

        memo[0][0] = rootNum;
        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++) {
                if(j == 0){
                    // 시작
                    int tempMax = triangle[i][j] + memo[i - 1][j];
                    memo[i][j] = tempMax;
                } else if(j == triangle[i].length - 1){
                    // 끝
                    int tempMax = triangle[i][j] + memo[i - 1][j - 1];
                    memo[i][j] = tempMax;
                } else {
                    // 중간
                    int tempMax = Math.max(triangle[i][j] + memo[i - 1][j - 1], triangle[i][j] + memo[i-1][j]);
                    memo[i][j] = tempMax;
                }
            }
        }
        for(int i : memo[triangle.length - 1]){
            max = Math.max(max, i);
        }
        return max;
    }
}