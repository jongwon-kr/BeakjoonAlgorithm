import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] p, String[] c) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String ps : p) {
            map.put(ps, map.getOrDefault(ps, 0) + 1);
        }
        
        for (String cs : c) {
            map.put(cs, map.get(cs) - 1);
        }
        
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 0) {
                answer = e.getKey();
            }
        }

        return answer;
    }
}