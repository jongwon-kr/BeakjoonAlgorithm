import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] p, String[] c) {
        String answer = "";
        Map<String, Integer> pMap = new HashMap<>();

        for (String n : p) pMap.put(n, pMap.getOrDefault(n, 0) + 1);
        for (String n : c) pMap.put(n, pMap.get(n) - 1);
        
        for (Map.Entry<String, Integer> e : pMap.entrySet()) {
            if (e.getValue() > 0) {
                answer = e.getKey();
            }
        }

        return answer;
    }
}
