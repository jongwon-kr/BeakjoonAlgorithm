import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int k) {
        int cnt = 0;
        String baseStr = Integer.toString(n, k);
        String[] nums = baseStr.split("0");

        for(String num : nums) {
            if (!num.isEmpty() && isPrime(Long.parseLong(num))) {
                cnt++;
            }
        }

        return cnt;
    }

    // 소수 판별 메소드
    public boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}