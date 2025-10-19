import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int answer = 0;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        
        int sum = 0;
        System.out.println(len/2);
        for(int i : map.keySet()){
            answer++;
            if(answer == len/2){
                break;
            }
        }        
        
        return answer;
    }
}