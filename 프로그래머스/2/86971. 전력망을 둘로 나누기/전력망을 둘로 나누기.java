import java.util.*;

class Solution {
    
    
    public int solution(int n, int[][] wires) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int[] w : wires) {
            map.putIfAbsent(w[0], new ArrayList<>());
            map.get(w[0]).add(w[1]);
            map.putIfAbsent(w[1], new ArrayList<>());
            map.get(w[1]).add(w[0]);
        }
        
        for(int[] w : wires) {
            int a = w[0], b = w[1];
            int cnt = dfs(a, b, map);
            
            min = Math.min(min, Math.abs(cnt - (n - cnt)));
        }
        
        return min;
    }
    
    public int dfs(int a, int b, HashMap<Integer, ArrayList<Integer>> map){
        int cnt = 1;
        
        for(int node : map.get(a)){
            if(node == b){
                continue;
            }
            cnt += dfs(node, a, map);
        }
        
        return cnt;
    }
}