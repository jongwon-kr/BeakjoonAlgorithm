import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int stNum = 1;

        while(true) {
            if(stNum == n){
                answer++;
                break;
            }
            int tempSum = 0;
            for(int i = stNum; i < n; i++) {
                tempSum += i;
                if(tempSum > n) break;
                if(tempSum == n) answer++;
            }
            stNum++;
        }
        return answer;
    }
}