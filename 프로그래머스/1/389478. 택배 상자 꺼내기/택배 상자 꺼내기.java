import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int w, int num) {
        int[] rows = new int[n + 1];
        int[] cols = new int[n + 1];

        int r = 0;
        int c = 0;
        int dir = 1;

        for (int i = 1; i <= n; i++) {
            rows[i] = r;
            cols[i] = c;

            if (dir == 1) {
                if (c == w - 1) {
                    r++;
                    dir = -1;
                } else {
                    c++;
                }
            } else {
                if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    c--;
                }
            }
        }

        int answer = 0;
        int targetRow = rows[num];
        int targetCol = cols[num];

        for (int i = 1; i <= n; i++) {
            if (cols[i] == targetCol && rows[i] >= targetRow) {
                answer++;
            }
        }

        return answer;
    }
}