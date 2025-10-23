import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 0;
        int idx = 0;

        while (idx < routes.length) {
            int curEnd = routes[idx][1];
            cnt++;
            if (idx < routes.length - 1) {
                int tempIdx = idx + 1;
                while (tempIdx < routes.length) {
                    if (routes[tempIdx][0] <= curEnd) {
                        tempIdx++;
                    } else {
                        break;
                    }
                }
                idx = tempIdx - 1;
            }
            idx++;
        }

        int answer = cnt;
        return answer;
    }
}