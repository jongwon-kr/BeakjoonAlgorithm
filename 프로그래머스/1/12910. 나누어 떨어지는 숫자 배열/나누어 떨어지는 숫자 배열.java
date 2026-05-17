import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer;
    }
}