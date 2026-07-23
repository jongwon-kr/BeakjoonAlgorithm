import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int cur = prices[i];
            int conTime = 1;
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (cur <= prices[j]) {
                    conTime++;
                } else {
                    break;
                }
            }
            answer[i] = conTime;
        }

        return answer;
    }
}