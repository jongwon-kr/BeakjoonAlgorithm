import java.util.*;

class Solution {
    public int solution(int[] ps, int location) {
        int answer = 0;
        
        ArrayDeque<int[]> adq = new ArrayDeque<>();
        for (int i = 0; i < ps.length; i++) {
            adq.offer(new int[]{ps[i], i});
        }
        
        Arrays.sort(ps);
        int maxIdx = ps.length - 1;
        while (!adq.isEmpty()) {
            int[] cur = adq.pollFirst();
            if (ps[maxIdx] == cur[0]) {
                answer++;
                if (cur[1] == location) {
                    break;
                } else {
                    maxIdx--;
                }
            } else {
                adq.offer(cur);
            }
        }
        return answer;
    }
}