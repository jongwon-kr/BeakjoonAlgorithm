import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int bh = board[0].length;
        int bw = board.length;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        String color = board[h][w];

        for (int i = 0; i < 4; i++) {
            int ch = h + dh[i];
            int cw = w + dw[i];

            if (ch < 0 || ch >= bh || cw < 0 || cw >= bw) {
                continue;
            }

            if (board[ch][cw].equals(color)) {
                answer++;
            }
        }
        return answer;
    }
}