import java.util.*;
import java.io.*;

class Solution {
    
    class Work {
        int p;
        int s;
        
        public Work(int p, int s) {
            this.p = p;
            this.s = s;
        }
    }
    
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int day = 1;
        ArrayDeque<Work> works = new ArrayDeque<>();
        // 각 기능들은 독립적으로 진행이 되지만 가장 앞의 기능이 배포될 때 완료된 기능들이 함께 배포된다.
        
        for (int i = 0; i < progresses.length; i++) {
            works.offer(new Work(progresses[i], speeds[i]));
        }
        
        int cnt = 0;
        
        while (!works.isEmpty()) {
            Work w = works.peek();
            if (w.p + w.s * day >= 100) {
                works.poll();
                cnt++;
                continue;
            } else {
                day++;
                if (cnt > 0) {
                    result.add(cnt);
                    cnt = 0;
                }
            }
        }
        result.add(cnt);
        return result.stream().mapToInt(i -> i).toArray();
    }
}