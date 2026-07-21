import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 폰켓몬의 종류 구하기 Set 활용(중복 x)
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int types = set.size();
        int len = nums.length;

        // N/2보다 작은 경우 그 값이 최대값이고 그렇지 않으면 N/2를 반환
        if (types <= len / 2) {
            answer = types;
        } else {
            answer = len / 2;
        }

        return answer;
    }
}