import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        int temp = arr[0];
        list.add(temp);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == temp) {
                continue;
            } else {
                temp = arr[i];
                list.add(arr[i]);
            }
        }
    
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}