import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int min = Math.min(n, m);
        int max = Math.max(n, m);
        int n1 = 1;
        // 최대 공약수
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                n1 = Math.max(n1, i);
            }
        }
        answer[0] = n1;

        int a = min, b = max;
        int n2 = 1;
        while (true) {
            if (a == b) {
                n2 = a;
                break;
            }
            if (a < b) {
                a += min;
            }
            if(b < a) {
                b += max;
            }
        }
        answer[1] = n2;

        return answer;
    }
}