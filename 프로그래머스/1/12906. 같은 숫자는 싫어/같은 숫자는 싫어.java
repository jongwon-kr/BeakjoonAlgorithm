import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        // 스택, 큐 자료구조를 사용할때 공통적으로 ArrayDeque를 사용합니다.
        ArrayDeque<Integer> arrDQ = new ArrayDeque<>();
        
        for (int i : arr) {
            
            if (arrDQ.isEmpty()) {
                arrDQ.offer(i);
                continue;
            }
            
            if (arrDQ.peekLast() != i) {
                arrDQ.offer(i);
            }
        }
        
        int[] result = new int[arrDQ.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrDQ.poll();
        }
 
        return result;
    }
}