import java.util.*;

class Solution {

    class Process {
        int value;
        int location;

        public Process(int value, int location) {
            this.value = value;
            this.location = location;
        }
    }

    public int solution(int[] ps, int location) {
        int answer = 0;

        // location에 있는 요소가 빠져나오면 종료 및 빠져나온 순서 반환
        ArrayDeque<Process> adq = new ArrayDeque<>();

        for (int i = 0; i < ps.length; i++) {
            adq.offer(new Process(ps[i], i));
        }

        // 오름차순 정렬
        Arrays.sort(ps);

        // 최대값 인덱스
        int maxIdx = ps.length - 1;

        while (!adq.isEmpty()) {
            Process p = adq.poll();
            int v = p.value;
            int l = p.location;

            // 최대 값이면 큐에서 제거
            if (v == ps[maxIdx]) {
                answer++;
                maxIdx--;
                if (l == location) {
                    break;
                }
            } else {
                adq.offer(p);
            }
        }
        return answer;
    }
}