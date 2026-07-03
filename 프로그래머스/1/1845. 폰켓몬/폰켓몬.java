import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        answer = set.size();

        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        return answer;
    }
}