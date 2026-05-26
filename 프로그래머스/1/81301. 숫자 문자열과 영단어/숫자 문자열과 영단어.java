import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        Map<String, Integer> numMap = new HashMap<>();
        numMap.put("zero", 0);
        numMap.put("one", 1);
        numMap.put("two", 2);
        numMap.put("three", 3);
        numMap.put("four", 4);
        numMap.put("five", 5);
        numMap.put("six", 6);
        numMap.put("seven", 7);
        numMap.put("eight", 8);
        numMap.put("nine", 9);

        for (Map.Entry<String, Integer> entry : numMap.entrySet()) {
            s = s.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));
        }

        return Integer.parseInt(s);
    }
}