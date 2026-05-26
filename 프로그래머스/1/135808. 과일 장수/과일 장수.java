import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int aCnt = 0;
        int min = Integer.MAX_VALUE;

        Arrays.sort(score);
        for (int i = score.length - 1; i >= 0; i--) {
            aCnt++;
            min = Math.min(score[i], min);
            if (aCnt == m) {
                answer += min * m;
                min = Integer.MAX_VALUE;
                aCnt = 0;
            }
        }
        return answer;
    }
}