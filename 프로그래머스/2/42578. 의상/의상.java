import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cArr : clothes) {
            map.put(cArr[1], map.getOrDefault(cArr[1], 1) + 1);
        }
        
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            answer *= e.getValue();
        }
        
        return answer - 1;
    }
}