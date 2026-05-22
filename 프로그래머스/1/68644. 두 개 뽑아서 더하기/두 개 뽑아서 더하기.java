import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        int[] arr = new int[set.size()];
        int idx = 0;
        for (int i : set) {
            arr[idx] = i;
            idx++;
        }
        Arrays.sort(arr);
        return arr;
    }
}