import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {
            char[] cArr = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                char c = cArr[i];
                if (map.containsKey(c)) {
                    int min = Math.min(map.get(c), i + 1);
                    map.put(c, min);
                } else {
                    map.put(c, i + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            char[] cArr = targets[i].toCharArray();
            for (char c : cArr) {
                if (map.containsKey(c)) {
                    answer[i] += map.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}