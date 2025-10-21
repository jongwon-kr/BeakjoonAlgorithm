import java.util.*;

class Solution {
    
    int max = -1;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, visited, 0);
        
        return max;
    }
    
    public void dfs(int k, int[][] dungeons, boolean[] visited, int cnt){
        
        if(cnt > dungeons.length){
            return;
        }
        
        for(int i = 0; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, visited, cnt + 1);
                visited[i] = false;
            }
        }
        
        max = Math.max(max, cnt);
    }
}