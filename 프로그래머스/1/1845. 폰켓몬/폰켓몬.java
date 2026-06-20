import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 폰켓몬 배열 순서 + type
        // N/2마리를 가져도 된다 
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        if (set.size() > 0) {
            answer = set.size();
        }
        
        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        
        return answer;
    }
}