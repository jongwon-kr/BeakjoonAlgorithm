import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        List<ArrayList<Integer>> netList = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            netList.add(new ArrayList<>());
            int[] c = computers[i];
            for(int j = 0; j < c.length; j++){
                if(i != j && c[j] == 1){
                    netList.get(i).add(j);
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;

        for(int i = 0; i < n; i++) {

            if(visited[i]){
                continue;
            } else {
                q.add(i);
                cnt++;
            }

            while(!q.isEmpty()){
                int c = q.poll();
                visited[c] = true;

                for(int k : netList.get(c)){
                    if(!visited[k]){
                        q.add(k);
                    }
                }
            }
        }

        return cnt;
    }
}