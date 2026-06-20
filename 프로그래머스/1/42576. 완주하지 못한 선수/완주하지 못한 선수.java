import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] p, String[] c) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < p.length; i++) {
            map.put(p[i], map.getOrDefault(p[i], 0) + 1);
        }
        
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) - 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }
        
        return answer;
    }
}