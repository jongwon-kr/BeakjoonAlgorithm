import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wMap = new HashMap<>();

        for(int i = 0; i < want.length; i++) {
            wMap.put(want[i], number[i]);
        }

        for(int i = 0; i <= discount.length - 10; i++) {

            Map<String, Integer> dMap = new HashMap<>();

            for(int j = i; j < i + 10; j++) {
                dMap.put(discount[j], dMap.getOrDefault(discount[j], 0) + 1);
            }

            if(isMatch(wMap, dMap)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isMatch(Map<String, Integer> wMap, Map<String, Integer> dMap) {
        for(String key : wMap.keySet()) {
            if(dMap.getOrDefault(key, 0) < wMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}