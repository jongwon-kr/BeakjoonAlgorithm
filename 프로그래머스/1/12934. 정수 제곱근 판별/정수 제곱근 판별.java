import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        long answer = -1L;
        
        long maxValue = 50000000000000L;
        long i = 1L;
        long curValue = i * i;
        
        while (curValue <= maxValue) {
            curValue = i * i;
            
            if (n == curValue) {
                i++;
                return i * i;
            } else if (curValue > n) {
                return answer;
            }
            
            i++;
        }
        return answer;
    }
}