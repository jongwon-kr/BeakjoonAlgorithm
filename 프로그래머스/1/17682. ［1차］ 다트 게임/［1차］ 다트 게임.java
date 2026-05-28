import java.util.*;
import java.io.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int nIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                nIdx++;
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[nIdx] = 10;
                    i++;
                } else {
                    scores[nIdx] = c - '0';
                }
            }
            else {
                switch (c) {
                    case 'S':
                        scores[nIdx] = (int) Math.pow(scores[nIdx], 1);
                        break;
                    case 'D':
                        scores[nIdx] = (int) Math.pow(scores[nIdx], 2);
                        break;
                    case 'T':
                        scores[nIdx] = (int) Math.pow(scores[nIdx], 3);
                        break;
                    case '*':
                        scores[nIdx] *= 2;
                        if (nIdx > 0) {
                            scores[nIdx - 1] *= 2;
                        }
                        break;
                    case '#':
                        scores[nIdx] *= -1;
                        break;
                }
            }
        }

        answer = scores[0] + scores[1] + scores[2];
        return answer;
    }
}