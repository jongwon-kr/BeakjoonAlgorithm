import java.util.*;

class Solution {
    public int solution(int[] ps, int location) {
        int answer = 0;
        
        // 큐를 통해서 우선순위가 높은 순서대로 실행이 되도록 하고 location의 값도 큐가 변함에 따라 변화
        // 프로세스가 실행되는 횟수 카운팅 location의 프로세스가 실행 될 때 return
        ArrayDeque<int[]> adq = new ArrayDeque<>();
        for (int i = 0; i < ps.length; i++) {
            adq.offer(new int[]{ps[i], i});
        }
        
        Arrays.sort(ps);
        int maxIdx = ps.length - 1;
        int cnt = 0;
        while (!adq.isEmpty()) {
            int[] cur = adq.pollFirst();
            if (ps[maxIdx] == cur[0]) {
                if (cur[1] == location) {
                    cnt++;
                    answer = cnt;
                    break;
                } else {
                    cnt++;
                    maxIdx--;
                }
            } else {
                adq.offer(cur);
            }
        }
        return answer;
    }
}