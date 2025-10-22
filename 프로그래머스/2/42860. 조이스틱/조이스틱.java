import java.util.*;

class Solution {
    public int solution(String name) {
        int length = name.length();
        int answer = 0;

        for (int i = 0; i < length; i++) {
            char cur = name.charAt(i);
            answer += Math.min(cur - 'A', 'Z' - cur + 1);
        }

        int minMove = length - 1;

        for (int i = 0; i < length; i++) {
            int next_idx = i + 1;
            while (next_idx < length && name.charAt(next_idx) == 'A') {
                next_idx++;
            }

            int remaining_move = length - next_idx;
            int move1 = i * 2 + remaining_move;
            int move2 = remaining_move * 2 + i;
            minMove = Math.min(minMove, move1);
            minMove = Math.min(minMove, move2);
        }

        return answer + minMove;
    }
}