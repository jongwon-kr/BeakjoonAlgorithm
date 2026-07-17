import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> s = new Stack<>();
        
        for (int i : arr) {
            if (!s.isEmpty()) {
                if (i != s.peek()) {
                    s.push(i);
                }
            } else {
                s.push(i);
            }
        }
        
        int[] result = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        
        return result;
    }
}