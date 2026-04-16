import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {

        int result = 0;
        Map<String, Integer> wMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wMap.put(want[i], number[i]);
        }

        Map<String, Integer> window = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            window.put(discount[i], window.getOrDefault(discount[i], 0) + 1);
        }
        if (isMatch(wMap, window)) result++;

        for (int i = 1; i <= discount.length - 10; i++) {
            String prev = discount[i - 1];
            String next = discount[i + 9];

            window.put(prev, window.get(prev) - 1);
            window.put(next, window.getOrDefault(next, 0) + 1);

            if(isMatch(wMap, window)) result++;
        }

        return result;
    }

    private boolean isMatch(Map<String, Integer> wMap, Map<String, Integer> w) {
        for (String key : wMap.keySet()) {
            if(!w.getOrDefault(key, 0).equals(wMap.get(key))) return false;
        }
        return true;
    }
}