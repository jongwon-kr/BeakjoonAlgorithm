import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedLimit = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] > paintedLimit) {
                answer++;
                paintedLimit = section[i] + m - 1;
            }
        }

        return answer;
    }
}