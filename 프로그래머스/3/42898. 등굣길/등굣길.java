import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] field = new int[m + 1][n + 1];
        field[1][1] = 1;
        for(int[] arr : puddles) {
            field[arr[0]][arr[1]] = -1;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(field[i][j] == -1){
                    field[i][j] = 0;
                } else if(field[i][j] == 0){
                    field[i][j] = (field[i - 1][j] + field[i][j - 1]) % 1000000007;
                }
            }
        }
        return field[m][n];
    }
}