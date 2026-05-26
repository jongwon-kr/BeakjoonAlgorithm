import java.util.*;
import java.io.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int weight = getMeasureCnt(i);
            if (weight > limit) {
                weight = power;
            }
            answer += weight;
        }
        return answer;
    }

    int getMeasureCnt(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}