import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int cnt = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        cnt++;
                    }
                }
            }
        }
        answer = cnt;
        return answer;
    }

    boolean isPrime(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
            }
        }
        return result;
    }
}